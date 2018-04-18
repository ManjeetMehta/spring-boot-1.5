package com.mehta.applications.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehta.applications.common.vo.EmployeeVo;
import com.mehta.applications.model.Employee;
import com.mehta.applications.repository.EmployeeRepository;
import com.mehta.applications.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Integer createEmployee(EmployeeVo employeeVo) {
		if (employeeVo != null) {
			Employee employee = new Employee();
	//		employee.setId(employeeVo.getId());
			employee.setFirstName(employeeVo.getFirstName());
			employee.setMiddleName(employeeVo.getMiddleName());
			employee.setLastName(employeeVo.getLastName());
			employee.setStoragefolderName(employeeVo.getStorageForderName());
			employee.setDateOfBirth(employeeVo.getDateOfBirth());
			employee.setJoiningDate(employeeVo.getJoiningDate()); 
			employee.setNationality(employeeVo.getNationality());
			employee.setEmail(employeeVo.getEmail()); 
			employee.setPassportNumber(employeeVo.getPassportNumber());
			employee.setResidentPermit(employeeVo.getResidentPermit()); 
			employee.setActive(employeeVo.getActive()); 
			employee.setCorporateId(employeeVo.getCorporateId()); 
			employee.setCreated(employeeVo.getCreated()); 
			employee.setCreatedBy(employeeVo.getCreatedBy()); 
			employee.setLastModified(employeeVo.getLastModified()); 
			employee.setLastModifiedBy(employeeVo.getLastModifiedBy());
				
			employee = employeeRepository.save(employee);

			if (employee !=null && employee.getId() != null)
			return employee.getId();
		}

		
		return null;
	}

	@Override
	public Boolean updateEmployee(EmployeeVo employeeVo) {
		if (employeeVo != null && employeeVo.getId() !=null) {
			Employee employee = employeeRepository.findOne(employeeVo.getId());
			if (employee != null) {
				employee = new Employee();
				employee.setId(employeeVo.getId());
				employee.setFirstName(employeeVo.getFirstName());
				employee.setMiddleName(employeeVo.getMiddleName());
				employee.setLastName(employeeVo.getLastName());
				employee.setStoragefolderName(employeeVo.getStorageForderName());
				employee.setDateOfBirth(employeeVo.getDateOfBirth());
				employee.setJoiningDate(employeeVo.getJoiningDate()); 
				employee.setNationality(employeeVo.getNationality());
				employee.setEmail(employeeVo.getEmail()); 
				employee.setPassportNumber(employeeVo.getPassportNumber());
				employee.setResidentPermit(employeeVo.getResidentPermit()); 
				employee.setActive(employeeVo.getActive()); 
				employee.setCorporateId(employeeVo.getCorporateId()); 
				employee.setCreated(employeeVo.getCreated()); 
				employee.setCreatedBy(employeeVo.getCreatedBy()); 
				employee.setLastModified(employeeVo.getLastModified()); 
				employee.setLastModifiedBy(employeeVo.getLastModifiedBy());
			}
			employeeRepository.save(employee);
			return true;
		}
		return false;
	}

	@Override
	public EmployeeVo readEmployee(Integer id) {
		EmployeeVo employeeVo= null;
		if (id!= null) {
			Employee employee = employeeRepository.findOne(id);
			if (employee != null) {
				employeeVo = new EmployeeVo();

				employeeVo.setFirstName(employee.getFirstName());
				employeeVo.setMiddleName(employee.getMiddleName());
				employeeVo.setLastName(employee.getLastName());
				employeeVo.setStorageForderName(employee.getStoragefolderName());
				employeeVo.setCorporateId(employee.getCorporateId());
				employeeVo.setActive(employee.getActive());
				employeeVo.setLastModified(employee.getLastModified());
				employeeVo.setLastModifiedBy(employee.getLastModifiedBy());
				employeeVo.setCreated(employee.getCreated());
				employeeVo.setResidentPermit(employee.getResidentPermit());
				employeeVo.setEmail(employee.getEmail());
				employeeVo.setCreatedBy(employee.getCorporateId());
				employeeVo.setDateOfBirth(employee.getDateOfBirth());
				employeeVo.setJoiningDate(employee.getJoiningDate());
			}
		}
		return employeeVo;
	}

	@Override
	public Boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeVo> listEmployee() {
		List<EmployeeVo> employeeVoList = null;
		List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
		
		if (employeeList != null) {
			employeeVoList = null;
			EmployeeVo employeeVo;
			for (Employee employee : employeeList) {
				if (employee != null) {
					employeeVo = new EmployeeVo();
					employeeVo.setId(employee.getId());
					employeeVo.setFirstName(employee.getFirstName());
					employeeVo.setMiddleName(employee.getMiddleName());
					employeeVo.setLastName(employee.getLastName());
					employeeVo.setStorageForderName(employee.getStoragefolderName());
					employeeVo.setCorporateId(employee.getCorporateId());
					employeeVo.setActive(employee.getActive());
					employeeVo.setLastModified(employee.getLastModified());
					employeeVo.setLastModifiedBy(employee.getLastModifiedBy());
					employeeVo.setCreated(employee.getCreated());
					employeeVo.setResidentPermit(employee.getResidentPermit());
					employeeVo.setEmail(employee.getEmail());
					employeeVo.setCreatedBy(employee.getCorporateId());
					employeeVo.setDateOfBirth(employee.getDateOfBirth());
					employeeVo.setJoiningDate(employee.getJoiningDate());
					employeeVoList.add(employeeVo);
				}
			}
			
		}
		return employeeVoList;
	}

	
}
