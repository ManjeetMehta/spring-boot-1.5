package com.sp.mehta.applications.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	OrgVo readOrg(@PathVariable Integer id) {
		OrgVo orgVo = null;
		if (id != null) {
			orgVo = orgService.readOrg(id);
		}
		return orgVo;
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	Map<String, Object> createOrg(@RequestBody OrgVo orgVo) {
		Map <String, Object> resultMap = new HashMap <String, Object>();
		Integer id = null;
		if (orgVo != null) {
			id = orgService.createOrg(orgVo);
			if (id!= null) {
				resultMap.put("id" , id);
				resultMap.put("success", true);
			}
			else {
				resultMap.put("error", "server error");
			}
			
		}
		else {
			resultMap.put("error", "input object can't be null");
		}
		return resultMap;
	}

	// @RequestMapping(value = ApplicationConstants.)
}
