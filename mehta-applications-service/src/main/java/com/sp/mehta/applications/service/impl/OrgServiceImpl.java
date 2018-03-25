package com.sp.mehta.applications.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sp.mehta.applications.common.vo.AddressVo;
import com.sp.mehta.applications.common.vo.OrgVo;
import com.sp.mehta.applications.common.vo.UserVo;
import com.sp.mehta.applications.model.Address;
import com.sp.mehta.applications.model.Org;
import com.sp.mehta.applications.repository.AddressRepository;
import com.sp.mehta.applications.repository.OrgRepository;
import com.sp.mehta.applications.service.OrgService;

@Component
public class OrgServiceImpl implements OrgService {

	@Autowired
	OrgRepository orgRepository;

	@Autowired
	AddressRepository addressRepository;

	@Override
	public Integer createOrg(OrgVo orgVo) {
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
					}

				}
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
					if (org.getAddress().getUser() != null)	{
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
		}}
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

}
