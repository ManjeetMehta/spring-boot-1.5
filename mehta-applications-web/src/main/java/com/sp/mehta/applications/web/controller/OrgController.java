package com.sp.mehta.applications.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.mehta.applications.common.constants.ApplicationConstants;
import com.sp.mehta.applications.common.vo.OrgVo;
import com.sp.mehta.applications.service.OrgService;

@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_ORG)
public class OrgController {

	@Autowired
	OrgService orgService;

	@Value("${mehta.welcome.message}")
	private String message;

	private static final Logger logger = LoggerFactory.getLogger(OrgController.class);

	@ExceptionHandler({ NullPointerException.class, NumberFormatException.class })
	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	Map<String, Object> readOrg(@PathVariable Integer id) {
		logger.info("Org Read contoller Called...");
		OrgVo orgVo = null;
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (id != null) {
			orgVo = orgService.readOrg(id);
			resultMap.put("success", true);
			resultMap.put("orgVo", orgVo);
			if (orgVo != null) {
				logger.info("orgvo Return");
				// throw new NumberFormatException();
			} else
				logger.warn("Invalid orgId..");

		} else {
			logger.error("Id is null...");
		}
		return resultMap;
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	Map<String, Object> createOrg(@RequestBody OrgVo orgVo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Integer id = null;

		if (orgVo != null) {
			id = orgService.createOrg(orgVo);
			if (id != null) {
				resultMap.put("id", id);
				resultMap.put("success", true);
			} else {
				resultMap.put("error", "server error");
			}

		} else {
			resultMap.put("error", "input object can't be null");
		}
		return resultMap;
	}

	// @RequestMapping(value = ApplicationConstants.)

	@RequestMapping(value = ApplicationConstants.OPERATION_LIST_BY_COUNTRY, method = RequestMethod.GET)
	Map<String, Object> listOrgbyCountry(@PathVariable String country) {
		List<OrgVo> orgVoList = null;
		Map<String, Object> resultMap = new HashMap<String, Object>();
			if (country != null & !(country.toString().trim().isEmpty())) {
				orgVoList = orgService.listOrgByCountry(country);
				if (orgVoList != null && orgVoList.size()>0) {
					resultMap.put("Success", true);
					resultMap.put("orgVos", orgVoList);
				}
				else {
					resultMap.put("error", "data not found");
				}
			}
			else {
				resultMap.put("error", "invalid country name");
			}
		return resultMap;
	}

}
