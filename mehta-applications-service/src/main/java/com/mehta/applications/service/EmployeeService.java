package com.mehta.applications.service;

import java.util.List;

import com.mehta.applications.common.vo.EmployeeVo;
import com.mehta.applications.model.Employee;

public interface EmployeeService  {

	Integer createEmployee (EmployeeVo employeeVo);
	
	Boolean updateEmployee (EmployeeVo employeeVo);
	
	EmployeeVo readEmployee (Integer id);
	
	Boolean deleteEmployee (Integer id);
	
	List<EmployeeVo> listEmployee();
}
