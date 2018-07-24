package com.mehta.applications.serviceTest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mehta.applications.common.vo.AddressVo;
import com.mehta.applications.common.vo.OrgVo;
import com.mehta.applications.service.OrgService;


public class orgTest {
	
	private static final Logger logger = LoggerFactory.getLogger(orgTest.class);

	@Autowired
	OrgService orgService;
	
	
	@Test
	public void orgCreatTest(){
		Integer i = null;
		AddressVo addressVo= new AddressVo();
		OrgVo orgVo = new OrgVo(101, "manjeet", "India", true, addressVo); 
		i = orgService.createOrg(orgVo);
		if (i>0)
		{
			logger.info("success");
		}
		else{
			logger.error("failed");
		}
	}
}
