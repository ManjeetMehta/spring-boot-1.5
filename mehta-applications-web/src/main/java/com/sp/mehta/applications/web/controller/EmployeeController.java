	package com.sp.mehta.applications.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.mehta.applications.common.constants.ApplicationConstants;
import com.sp.mehta.applications.common.util.ResponseBuilder;
import com.sp.mehta.applications.common.vo.EmployeeVo;
import com.sp.mehta.applications.service.EmployeeService;

@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_EMPLOYEE)
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	public Object createEmployee(@RequestBody EmployeeVo employeeVo) {
			Integer id = employeeService.createEmployee(employeeVo);
	
	if (id != null && id>0) { 
		return new ResponseBuilder().status(ResponseBuilder.Status.success).id(id).build();
	}	
		return new ResponseBuilder().status(ResponseBuilder.Status.error).id(id).build();
	
	}
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	EmployeeVo readEmployee(@PathVariable Integer id) {
		EmployeeVo employeeVo = null;
		if (id != null) {
			employeeVo = employeeService.readEmployee(id);
		}
	return employeeVo;
			
	}
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_UPDATE, method = RequestMethod.POST)
	Boolean updateEmployee(@RequestBody EmployeeVo employeeVo) {
	if (employeeVo != null) {
		return employeeService.updateEmployee(employeeVo);
	}
	return false;
	}
}
