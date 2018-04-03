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

import com.mehta.applications.common.constants.ApplicationConstants;
import com.mehta.applications.common.vo.AddressDetailsVo;
import com.mehta.applications.common.vo.AddressVo;
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
	
	
	@RequestMapping (value= ApplicationConstants.OPERATION_ADDRESS_DETAILS, method = RequestMethod.GET)
	Map <String, Object> addressDetails (@RequestBody Integer id){
		Map <String, Object> resultMap = new HashMap<>();
		if (id != null) {
			AddressDetailsVo addressDetailsVo= null;
			addressDetailsVo = addressService.readAddressDetails(id);
			if (addressDetailsVo != null) {
				resultMap.put("Addess Details", addressDetailsVo);
				resultMap.put("Success", true);
			}
			else {
				resultMap.put("Error", "internal error");
			}
		}
		return resultMap;
	}
	
	@RequestMapping (value= ApplicationConstants.OPERATION_CREATE_COMPOSITE_ADDRESS, method = RequestMethod.POST)
	Map <String, Object> creatCompositAddress (@RequestBody AddressVo addressVo){
		Map <String, Object> resultMap = new HashMap<>();
		Integer id = null;
		if (addressVo != null) {
			id = addressService.createCompositeAddress(addressVo);
			if (id != null) {
				resultMap.put("Success", true);
				resultMap.put("id", id);
			}
			else {
				resultMap.put("Error", "Internal Error");
			}
		}
		else
		{
			resultMap.put("Error", "id can't be null");
		}
		return resultMap;
	}
	
//	@RequestMapping (value= )
	
}
