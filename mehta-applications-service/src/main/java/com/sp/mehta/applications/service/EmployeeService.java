package com.sp.mehta.applications.service;

import java.util.List;

import com.sp.mehta.applications.common.vo.EmployeeVo;
import com.sp.mehta.applications.model.Employee;

public interface EmployeeService  {

	Integer createEmployee (EmployeeVo employeeVo);
	
	Boolean updateEmployee (EmployeeVo EmployeeVo);
	
	EmployeeVo readEmployee (Integer id);
	
	Boolean deleteEmployee (Integer id);
	
	List<EmployeeVo> listEmployee();
}
