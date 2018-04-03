package com.mehta.applications.security.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mehta.applications.common.constants.ApplicationConstants;
import com.mehta.applications.common.vo.SystemVo;
import com.mehta.applications.security.service.SystemService;

@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_SYSTEM)
public class SystemController {

	@Autowired
	SystemService systemService;

	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	Map<String, Object> readSystem(@PathVariable Integer id) {
		Map<String, Object> resultMap = new HashMap<>();
		if (id != null) {
			SystemVo systemVo = systemService.readSystem(id);
			if (systemVo != null) {
				resultMap.put("staus", "success");
				resultMap.put("systemVo", systemVo);
			} else {
				resultMap.put("status", "success");
				resultMap.put("systemVo", systemVo);
				resultMap.put("message", "id not found");
			}
		} else {
			resultMap.put("status", "error");
			resultMap.put("message", "invalid id");

		}

		return resultMap;
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	Map<String, Object> createSystem(@RequestBody SystemVo systemVo) {
		Map<String, Object> resultMap = new HashMap<>();
		if (systemVo != null) {
			Integer id = systemService.createSystem(systemVo);
			resultMap.put("status", "success");
			resultMap.put("id", id);
		} else {
			resultMap.put("status", "failed");
		}

		return resultMap;
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_LIST, method = RequestMethod.GET)
	Map<String, Object> listSystem() {
		Map<String, Object> resultMap = new HashMap<>();
		List<SystemVo> systemVoList = null;
		systemVoList = systemService.listSystem();
		resultMap.put("status", "success");
		resultMap.put("Systemlist", systemVoList);
		return resultMap;
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_UPDATE, method = RequestMethod.POST)
	Map<String, Object> updateSystem(@RequestBody SystemVo systemVo) {
		Map<String, Object> resultMap = new HashMap<>();
		if (systemVo != null) {
			Boolean st = systemService.updateSystem(systemVo);
			resultMap.put("status", "success");
		} else {
			resultMap.put("status", "failed");
		}

		return resultMap;
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_DELETE, method = RequestMethod.GET)
	Map<String, Object> deleteSystem(@PathVariable Integer id) {
		
		Map<String, Object> resultMap = new HashMap<>();
		if (id != null) {
			Boolean st = systemService.deleteSystem(id);
			resultMap.put("status", "success");
			// resultMap.put(key, value)
		} else {
			resultMap.put("status", "failed");
		}

		return resultMap;
	}

}
