package com.sp.mehta.applications.service;

import java.util.List;

import com.mehta.applications.common.vo.PolicyVo;

public interface PolicyService {

	Integer createPolicy (PolicyVo policyVo);
	
	PolicyVo readPolicy (Integer id);
	
	Boolean updatePolicy(PolicyVo policyVo);
	
	Boolean deletePolicy();
	
	List<PolicyVo> listPolicy();
}
