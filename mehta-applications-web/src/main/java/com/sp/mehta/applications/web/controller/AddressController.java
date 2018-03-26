package com.sp.mehta.applications.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.mehta.applications.common.constants.ApplicationConstants;
import com.sp.mehta.applications.common.vo.AddressVo;
import com.sp.mehta.applications.service.AddressService;

@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_ADDRESS)
public class AddressController {

	@Autowired
	AddressService addressService;
	
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

	// inject via application.properties
	@Value("${mehta.welcome.message}")
	private String message;

	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	Map<String, Object> readAddress(@PathVariable Integer id) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		AddressVo addressVo = null;
		if (id != null) {
			addressVo = addressService.readAddress(id);
			if (addressVo != null) {
				resultMap.put("adressVo", addressVo);
				resultMap.put("success", true);
			} else {
				resultMap.put("Error", "id not found");
				return resultMap;
			}
		} else {
			resultMap.put("Error", "id can't be null");
		}
		return resultMap;
	}
	
	

	@RequestMapping(value = ApplicationConstants.OPERATION_LIST, method = RequestMethod.GET)
	List<AddressVo> listAddress() {
		List<AddressVo> addressVoList = null;

		addressVoList = addressService.listAddress();

		return addressVoList;
	}
	
	@RequestMapping (value= ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	Map<String, Object> createAddress (@RequestBody AddressVo addressVo) {
		Integer id= null;
		Map <String, Object> resultMap = new HashMap<String, Object>();
		logger.info(message);
		if (addressVo != null) {
			id = addressService.createAddress(addressVo);
			resultMap.put("id", id);
			
		}
		
		return resultMap;
		
	}
	
	
	@RequestMapping (value= ApplicationConstants.OPERATION_UPDATE, method = RequestMethod.POST)
	Boolean UpdateAddress (@RequestBody AddressVo addressVo) {
		
		logger.info(message);
		if (addressVo != null) {
			return addressService.updateAddress(addressVo);
		}
		
		return false;
		
	}
	
}
