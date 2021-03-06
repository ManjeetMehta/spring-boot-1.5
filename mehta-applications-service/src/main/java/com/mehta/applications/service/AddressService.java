package com.mehta.applications.service;

import java.util.List;

import com.mehta.applications.common.vo.AddressDetailsVo;
import com.mehta.applications.common.vo.AddressVo;
import com.mehta.applications.model.Address;

public interface AddressService {
	
	Integer createAddress(AddressVo addressVo);
	
	Boolean updateAddress(AddressVo addressVo);
	
	AddressVo readAddress(Integer id);
	
	Boolean deleteAddress(Integer id);
	
	List<AddressVo> listAddress();
	
	AddressDetailsVo readAddressDetails(Integer id);

	Integer createCompositeAddress (AddressVo addressVo);
	
	List<AddressVo> listCountry(String country);
}
