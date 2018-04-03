package com.sp.mehta.applications.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehta.applications.common.vo.AddressVo;
import com.mehta.applications.common.vo.OrgDetailsVo;
import com.mehta.applications.common.vo.OrgVo;
import com.mehta.applications.common.vo.UserVo;
import com.sp.mehta.applications.model.Address;
import com.sp.mehta.applications.model.Org;
import com.sp.mehta.applications.repository.AddressRepository;
import com.sp.mehta.applications.repository.OrgRepository;
import com.sp.mehta.applications.service.AddressService;
import com.sp.mehta.applications.service.OrgService;

@Component
public class OrgServiceImpl implements OrgService {

	@Autowired
	OrgRepository orgRepository;

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	AddressService addressService;

	private static final Logger logger = LoggerFactory.getLogger(OrgServiceImpl.class);

	@Override
	public Integer createOrg(OrgVo orgVo) {
		if (orgVo != null) {
			Org org = new Org();
			org.setName(orgVo.getName());
			org.setCountry(orgVo.getCountry());
			org.setActive(orgVo.isActive());

			Address address = null;
			if (orgVo.getAddressVo() != null && orgVo.getAddressVo().getId() != null) {
				Integer id = orgVo.getAddressVo().getId();
				if (id != null) {
					address = addressRepository.findOne(id);
					if (address != null) {
						org.setAddress(address);
					} else {
						logger.error("Invalid address Id");
						return null;
					}
				}
			} else {
				logger.error("Address Can't be null");
				return null;
			}

			org = orgRepository.save(org);
			if (org != null) {
				return org.getId();
			}
		}
		return null;
	}

	@Override
	public Integer createCompositeOrg(OrgVo orgVo) {
		if (orgVo != null) {
			Org org = new Org();
			org.setName(orgVo.getName());
			org.setCountry(orgVo.getCountry());
			org.setActive(orgVo.isActive());

			Address address = null;
			if (orgVo.getAddressVo() != null) {
				Integer id = orgVo.getAddressVo().getId();
				if (id != null) {
					address = addressRepository.findOne(id);
					if (address != null) {
						org.setAddress(address);
					} else {
						logger.error("Invalid Address Id");
						return null;
					}
				} else {
					Integer addressId = addressService.createAddress(orgVo.getAddressVo());
					if (addressId != null) {
						address = addressRepository.findOne(addressId);
						if (address != null) {
							org.setAddress(address);
						} else {
							logger.error("Address Can't be creatd...");
							return null;
						}
					}

				}

			} else {
				logger.error("Address Can't be null");
				return null;
			}

			org = orgRepository.save(org);
			if (org != null) {
				return org.getId();
			}
		}
		return null;
	}

	@Override
	public boolean updateOrg(Org org) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrgVo readOrg(Integer id) {
		OrgVo orgVo = null;
		if (id != null) {
			Org org = orgRepository.findOne(id);
			if (org != null) {
				orgVo = new OrgVo();
				orgVo.setId(org.getId());
				orgVo.setName(org.getName());
				orgVo.setCountry(org.getCountry());
				orgVo.setActive(org.isActive());

				if (org.getAddress() != null) {
					AddressVo addressVo = new AddressVo();
					addressVo.setId(org.getAddress().getId());
					orgVo.setAddressVo(addressVo);
					addressVo.setCity(org.getAddress().getCity());
					addressVo.setCountry(org.getAddress().getCountry());
					addressVo.setPincode(org.getAddress().getPincode());
					addressVo.setState(org.getAddress().getState());
					if (org.getAddress().getUser() != null) {
						UserVo userVo = new UserVo();
						userVo.setId(org.getAddress().getUser().getId());
						addressVo.setUserVo(userVo);
						userVo.setUserName(org.getAddress().getUser().getUserName());
						userVo.setEmail(org.getAddress().getUser().getEmail());
						userVo.setActive(org.getAddress().getUser().getActive());
						userVo.setPassword(org.getAddress().getUser().getPassword());
					}
					orgVo.setAddressVo(addressVo);

				}
			}
		}
		return orgVo;
	}

	@Override
	public boolean deleteOrg(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrgVo> listOrg() {
		List<OrgVo> orgVoList = null;
		List<Org> orgList = (List<Org>) orgRepository.findAll();

		if (orgList != null) {
			orgVoList = new ArrayList<OrgVo>();
			OrgVo orgVo = null;
			for (Org org : orgList) {
				if (org != null) {
					orgVo = new OrgVo();
					orgVo.setName(org.getName());
					orgVo.setCountry(org.getCountry());
					orgVo.setActive(org.isActive());

					AddressVo addressVo = new AddressVo();
					addressVo.setId(org.getAddress().getId());

					orgVo.setAddressVo(addressVo);
					orgVoList.add(orgVo);
				}
			}
		}
		return orgVoList;
	}

	@Override
	public List<OrgVo> listOrgByCountry(String country) {
		List<OrgVo> orgVoList = null;
		if (country != null && !(country.toString().trim().isEmpty())) {
			List<Org> orgList = orgRepository.findAllByCountry(country);

			if (orgList != null) {

				orgVoList = new ArrayList<OrgVo>();
				OrgVo orgVo = null;
				for (Org org : orgList) {
					if (org != null) {
						orgVo = new OrgVo();
						orgVo.setId(org.getId());
						orgVo.setName(org.getName());
						orgVo.setActive(org.isActive());
						orgVo.setCountry(org.getCountry());
						orgVoList.add(orgVo);
					}
				}
			}
		}

		return orgVoList;
	}

	@Override
	public OrgDetailsVo readOrgDetails(Integer id) {

		OrgDetailsVo orgDetailsVo = null;
		if (id != null) {
			Org org = orgRepository.findOne(id);
			if (org != null) {
				orgDetailsVo = new OrgDetailsVo();
				orgDetailsVo.setId(org.getId());
				orgDetailsVo.setName(org.getName());
				orgDetailsVo.setCountry(org.getCountry());
				orgDetailsVo.setActive(org.isActive());

				if (org.getAddress() != null) {
					orgDetailsVo.setState(org.getAddress().getState());
					orgDetailsVo.setCity(org.getAddress().getCity());
					orgDetailsVo.setPincode(Integer.parseInt(org.getAddress().getPincode()));
					if (org.getAddress().getUser() != null) {
						orgDetailsVo.setName(org.getAddress().getUser().getUserName());
						orgDetailsVo.setEmail(org.getAddress().getUser().getEmail());
						orgDetailsVo.setPassword(org.getAddress().getUser().getPassword());
					}
				}
			}
		}
		return orgDetailsVo;
	}
}
