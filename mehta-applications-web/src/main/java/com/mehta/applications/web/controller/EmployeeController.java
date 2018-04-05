	package com.mehta.applications.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mehta.applications.common.constants.ApplicationConstants;
import com.mehta.applications.common.util.ResponseBuilder;
import com.mehta.applications.common.vo.EmployeeVo;
import com.mehta.applications.service.EmployeeService;

@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_EMPLOYEE)
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	Map<String, Object> createEmployee(@RequestBody EmployeeVo employeeVo) {
			
			Integer id = employeeService.createEmployee(employeeVo);
	
	if (id != null && id>0) { 
		return new ResponseBuilder().status(ResponseBuilder.Status.success).id(id).build();
	}	
		return new ResponseBuilder().status(ResponseBuilder.Status.error).id(id).build();
	
	}
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	Map<String, Object> readEmployee(@PathVariable Integer id) {
		EmployeeVo employeeVo = null;
		Map<String, Object> resultMap = new HashMap<>();
		if (id != null) {
			employeeVo = employeeService.readEmployee(id);
			resultMap.put("success", true);
			resultMap.put("employeeVo", employeeVo);
		}
		else {
			resultMap.put("error", "internal error");
		}
	return resultMap;
			
	}
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_UPDATE, method = RequestMethod.POST)
	Map<String, Object> updateEmployee(@RequestBody EmployeeVo employeeVo) {
	Map<String, Object> resultMap = new HashMap<>();
	if (employeeVo != null) {
		employeeService.updateEmployee(employeeVo);
		resultMap.put("Success", true);
	}
	else {
		resultMap.put("Error", "failed");
	}
	return resultMap;
	}
}
