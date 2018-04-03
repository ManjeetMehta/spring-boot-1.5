package com.mehta.applications.security.service;

import java.util.List;

import com.mehta.applications.common.vo.SystemVo;

public interface SystemService {

	SystemVo readSystem(Integer id);
	
	Integer createSystem(SystemVo systemVo);
	
	Boolean updateSystem(SystemVo systemVo);
	
	Boolean deleteSystem(Integer id);
	
	List<SystemVo> listSystem();
}
