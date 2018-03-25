package com.sp.mehta.applications.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sp.mehta.applications.common.vo.EmployeeVo;
import com.sp.mehta.applications.model.Employee;
import com.sp.mehta.applications.repository.EmployeeRepository;
import com.sp.mehta.applications.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Integer createEmployee(EmployeeVo employeeVo) {
		if (employeeVo != null) {
			Employee employee = new Employee();
	//		employee.setId(employeeVo.getId());
			employee.setFirst_name(employeeVo.getFirst_name());
			employee.setMiddle_name(employeeVo.getMiddle_name());
			employee.setLast_name(employeeVo.getLast_name());
			employee.setStorage_forder_name(employeeVo.getStorage_forder_name());
			employee.setDate_of_birth(employeeVo.getDate_of_birth());
			employee.setJoining_date(employeeVo.getJoining_date()); 
			employee.setNationality(employeeVo.getNationality());
			employee.setEmail(employeeVo.getEmail()); 
			employee.setPassport_number(employeeVo.getPassport_number());
			employee.setResident_permit(employeeVo.getResident_permit()); 
			employee.setActive(employeeVo.getActive()); 
			employee.setCorporate_id(employeeVo.getCorporate_id()); 
			employee.setCreated(employeeVo.getCreated()); 
			employee.setCreated_by(employeeVo.getCreated_by()); 
			employee.setLast_modified(employeeVo.getLast_modified()); 
			employee.setLast_modified_by(employeeVo.getLast_modified_by());
			return employeeVo.getId();
					
		}
		
		return null;
	}

	@Override
	public Boolean updateEmployee(EmployeeVo EmployeeVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeVo readEmployee(Integer id) {
		EmployeeVo employeeVo= null;
		if (id!= null) {
			Employee employee = employeeRepository.findOne(id);
			if (employee != null) {
				employeeVo = new EmployeeVo();
				employeeVo.setActive(employee.getActive());
				employeeVo.setFirst_name(employee.getFirst_name());
				employeeVo.setMiddle_name(employee.getMiddle_name());
				employeeVo.setLast_name(employee.getLast_name());
				employeeVo.setStorage_forder_name(employee.getStorage_forder_name());
				employeeVo.setCorporate_id(employee.getCorporate_id());
				employeeVo.setCreated(employee.getCreated());
				employeeVo.setCreated_by(employee.getCreated_by());
			}
		}
		return null;
	}

	@Override
	public Boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeVo> listEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
