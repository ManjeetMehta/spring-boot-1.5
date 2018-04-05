package com.mehta.applications.security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehta.applications.common.vo.SystemVo;
import com.mehta.applications.security.model.ISystem;
import com.mehta.applications.security.repository.SystemRepository;
import com.mehta.applications.security.service.SystemService;

@Component
public class SystemServiceImpl implements SystemService {

	@Autowired
	SystemRepository systemRepository;
	
	@Override
	public SystemVo readSystem(Integer id) {
		SystemVo systemVo= null;
		if (id != null) {
			ISystem system = systemRepository.findOne(id);
			
			if (system != null) {
				systemVo = new SystemVo();
				systemVo.setId(system.getId());
				systemVo.setCreated(system.getCreated());
				systemVo.setCreatedBy(system.getCreatedBy());
				systemVo.setLastModified(system.getLastModified());
				systemVo.setLastModifiedBy(system.getLastModifiedBy());
				systemVo.setStorageFolderName(system.getStorageFolderName());
			}
		}
		return systemVo;
	}

	@Override
	public Integer createSystem(SystemVo systemVo) {
		Integer id = null;
		if (systemVo != null) {
			ISystem system = new ISystem();
			system.setCreated(systemVo.getCreated());
			system.setCreatedBy(systemVo.getCreatedBy());
			system.setLastModified(systemVo.getLastModified());
			system.setLastModifiedBy(systemVo.getLastModifiedBy());
			system.setStorageFolderName(systemVo.getStorageFolderName());
		
			system= systemRepository.save(system);
			if (system != null && system.getId()!= null)
				return system.getId();
		}
		return id;
	}

	@Override
	public Boolean updateSystem(SystemVo systemVo) {
		if (systemVo != null && systemVo.getId()!=null) {
			ISystem system = systemRepository.findOne(systemVo.getId());
			if (system != null) {
				system.setCreated(systemVo.getCreated());
				system.setCreatedBy(systemVo.getCreatedBy());
				system.setLastModified(systemVo.getLastModified());
				system.setLastModifiedBy(systemVo.getLastModifiedBy());
				system.setStorageFolderName(systemVo.getStorageFolderName());
				
				systemRepository.save(system);
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public Boolean deleteSystem(Integer id) {
		if (id != null) {
			ISystem system = systemRepository.findOne(id);
			if (system != null && system.getId() != null) {
				systemRepository.delete(id);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<SystemVo> listSystem() {
		List<SystemVo> systemVoList = null;
		List<ISystem> listSystem = (List<ISystem>) systemRepository.findAll();
		if (listSystem != null) {
			systemVoList = new ArrayList<SystemVo>();
			for (ISystem system : listSystem) {
				if (system != null) {
					SystemVo systemVo = new SystemVo();
					systemVo.setId(system.getId());
					systemVo.setCreated(system.getCreated());
					systemVo.setCreatedBy(system.getCreatedBy());
					systemVo.setLastModified(system.getLastModified());
					systemVo.setLastModifiedBy(system.getLastModifiedBy());
					systemVo.setStorageFolderName(system.getStorageFolderName());
					systemVoList.add(systemVo);
				}
			}
		}
		return systemVoList;
	}

}
