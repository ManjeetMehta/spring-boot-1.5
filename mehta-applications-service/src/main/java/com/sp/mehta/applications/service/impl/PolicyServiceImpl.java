package com.sp.mehta.applications.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehta.applications.common.vo.PolicyVo;
import com.sp.mehta.applications.model.Policy;
import com.sp.mehta.applications.repository.PolicyRepository;
import com.sp.mehta.applications.service.PolicyService;


@Component
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	
	@Override
	public Integer createPolicy(PolicyVo policyVo) {
		if (policyVo != null) {
			Policy policy = new Policy();
			policy.setPolicyNumber(policyVo.getPolicyNumber());
			policy.setStorageFolderName(policyVo.getStorageFolderName());
			policy.setPolicyStatus(policyVo.getPolicyStatus());
			policy.setPolicyIssueDate(policyVo.getPolicyIssueDate());
			policy.setPolicyEffectiveDate(policyVo.getPolicyEffectiveDate());
			policy.setPolicyExpiryDate(policyVo.getPolicyExpiryDate());
		/*	policy.setLastModified(policyVo.getLastModified());
			policy.setLastModifiedBy(policyVo.getLastModifiedBy());
			policy.setPolicyCreated(policyVo.getPolicyCreated());
			policy.setPolicyCreatedBy(policyVo.getPolicyCreatedBy());*/
			
			policy = policyRepository.save(policy);
			if (policy != null) {
				return policy.getId();
			}
		}
		return null;
	}

	@Override
	public PolicyVo readPolicy(Integer id) {
		PolicyVo policyVo = null;
		if (id != null) {
			Policy policy = policyRepository.findOne(id);
			
			if (policy != null) {
				policyVo = new PolicyVo();
				
				policyVo.setId(policy.getId());
				policyVo.setPolicyNumber(policy.getPolicyNumber());
				policyVo.setPolicyEffectiveDate(policy.getPolicyEffectiveDate());
				policyVo.setPolicyExpiryDate(policy.getPolicyExpiryDate());
				policyVo.setPolicyIssueDate(policy.getPolicyIssueDate());
				policyVo.setPolicyStatus(policy.getPolicyStatus());
				policyVo.setPolicyValue(policy.getPolicyValue());
				/*policyVo.setLastModified(policy.getLastModified());
				policyVo.setLastModifiedBy(policy.getLastModifiedBy());
				policyVo.setPolicyCreated(policy.getPolicyCreated());
				policyVo.setPolicyCreatedBy(policy.getPolicyCreatedBy());*/
			}
		}
		return policyVo;
	}

	@Override
	public Boolean updatePolicy(PolicyVo policyVo) {
		if (policyVo != null && policyVo.getId() != null) {
			Policy policy = policyRepository.findOne(policyVo.getId());
			
			if(policy != null) {
				 
				policy.setPolicyNumber(policyVo.getPolicyNumber());
				policy.setStorageFolderName(policyVo.getStorageFolderName());
				policy.setPolicyStatus(policyVo.getPolicyStatus());
				policy.setPolicyIssueDate(policyVo.getPolicyIssueDate());
				policy.setPolicyEffectiveDate(policyVo.getPolicyEffectiveDate());
				policy.setPolicyExpiryDate(policyVo.getPolicyExpiryDate());
				/*policy.setLastModified(policyVo.getLastModified());
				policy.setLastModifiedBy(policyVo.getLastModifiedBy());
				policy.setPolicyCreated(policyVo.getPolicyCreated());
				policy.setPolicyCreatedBy(policyVo.getPolicyCreatedBy());*/
				policyRepository.save(policy);
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean deletePolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listPolicy() {
		List<PolicyVo> policyVoList = null;
		List<Policy> listPolicy = (List<Policy>) policyRepository.findAll();
		
		if (listPolicy != null) {
			policyVoList = new ArrayList<PolicyVo>();
			PolicyVo policyVo;
			
			for (Policy policy : listPolicy) {
				if (policy != null) {
					policyVo = new PolicyVo();
					
					policyVo.setId(policy.getId());
					policyVo.setPolicyNumber(policy.getPolicyNumber());
					policyVo.setPolicyEffectiveDate(policy.getPolicyEffectiveDate());
					policyVo.setPolicyExpiryDate(policy.getPolicyExpiryDate());
					policyVo.setPolicyIssueDate(policy.getPolicyIssueDate());
					policyVo.setPolicyStatus(policy.getPolicyStatus());
					policyVo.setPolicyValue(policy.getPolicyValue());
					/*policyVo.setPolicyCreated(policy.getPolicyCreated());
					policyVo.setPolicyCreatedBy(policy.getPolicyCreatedBy());
					policyVo.setLastModified(policy.getLastModified());
					policyVo.setLastModifiedBy(policy.getLastModifiedBy());*/
					policyVoList.add(policyVo);
				}
			}
		}
		return policyVoList;
	}

}
