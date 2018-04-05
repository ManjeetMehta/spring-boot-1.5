package com.mehta.applications.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehta.applications.common.vo.GeoLocationVo;
import com.mehta.applications.model.GeoLocation;
import com.mehta.applications.repository.GeoLocationRepository;
import com.mehta.applications.service.GeoLocationService;

@Component
public class GeoLocationServiceImpl implements GeoLocationService {

	@Autowired
	GeoLocationRepository geoLocationRepository;
	
	@Override
	public Integer createGeoLocation(GeoLocationVo geoLocationVo) {
		if (geoLocationVo != null) {
			GeoLocation geoLocation = new GeoLocation();
	//		geoLocation.setId(geoLocationVo.getId());
			geoLocation.setArea(geoLocationVo.getArea());
			geoLocation.setStreet(geoLocationVo.getState());
			geoLocation.setBranch(geoLocationVo.getBranch());
			geoLocation.setCity(geoLocationVo.getCity());
			geoLocation.setZip(geoLocationVo.getZip());;
			geoLocation.setState(geoLocationVo.getState());
			geoLocation.setCountry(geoLocationVo.getCountry());
			geoLocation.setCreated(geoLocationVo.getCreated());
			geoLocation.setCreatedBy(geoLocationVo.getCreatedByTaskId());
			geoLocation.setCreatedByTaskId(geoLocationVo.getCreatedByTaskId());
			geoLocation.setLastModified(geoLocationVo.getLastModified());
			geoLocation.setLastModifiedBy(geoLocationVo.getLastModifiedBy());
			geoLocation = geoLocationRepository.save(geoLocation);
			if (geoLocation !=null)
				return geoLocation.getId();
		}
		return null;
	}

	@Override
	public GeoLocationVo readGeoLocation(Integer id) {
		if (id != null) {
			GeoLocation geoLocation = geoLocationRepository.findOne(id);
			if (geoLocation != null) {
				GeoLocationVo geoLocationVo = new GeoLocationVo();
				geoLocationVo.setId(geoLocation.getId());
				geoLocationVo.setArea(geoLocation.getArea());
				geoLocationVo.setBranch(geoLocation.getBranch());
				geoLocationVo.setStreet(geoLocation.getStreet());
				geoLocationVo.setCity(geoLocation.getCity());
				geoLocationVo.setState(geoLocation.getState());
				geoLocationVo.setZip(geoLocation.getZip());
				geoLocationVo.setCountry(geoLocation.getCountry());
				geoLocationVo.setCreated(geoLocation.getCreated());
				geoLocationVo.setCreatedBy(geoLocation.getCreatedBy());
				geoLocationVo.setCreatedByTaskId(geoLocation.getCreatedByTaskId());
				geoLocationVo.setLastModified(geoLocation.getLastModified());
				geoLocationVo.setLastModifiedBy(geoLocation.getLastModifiedBy());
				
				return geoLocationVo;
			}
		}
		return null;
	}

	@Override
	public Boolean updateGeoLocation(GeoLocationVo geoLocationVo) {
		if (geoLocationVo !=null) {
			GeoLocation geoLocation = geoLocationRepository.findOne(geoLocationVo.getId());
			if (geoLocation != null && geoLocation.getId()!= null) {
				geoLocation = new GeoLocation();
				geoLocation.setId(geoLocationVo.getId());
				geoLocation.setArea(geoLocationVo.getArea());
				geoLocation.setStreet(geoLocationVo.getState());
				geoLocation.setBranch(geoLocationVo.getBranch());
				geoLocation.setCity(geoLocationVo.getCity());
				geoLocation.setZip(geoLocationVo.getZip());;
				geoLocation.setState(geoLocationVo.getState());
				geoLocation.setCountry(geoLocationVo.getCountry());
				geoLocation.setCreated(geoLocationVo.getCreated());
				geoLocation.setCreatedBy(geoLocationVo.getCreatedByTaskId());
				geoLocation.setCreatedByTaskId(geoLocationVo.getCreatedByTaskId());
				geoLocation.setLastModified(geoLocationVo.getLastModified());
				geoLocation.setLastModifiedBy(geoLocationVo.getLastModifiedBy());
				geoLocation = geoLocationRepository.save(geoLocation);
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean deleteGeoLocation(Integer id) {
		if (id!=null) {
			GeoLocation geoLocation = geoLocationRepository.findOne(id);
			if (geoLocation != null)
			{
				geoLocationRepository.delete(id);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<GeoLocationVo> listGeoLocation() {
		List<GeoLocationVo> listGeoLocationVo= null;
		List<GeoLocation> listGeoLocation = (List<GeoLocation>)geoLocationRepository.findAll();
		if (listGeoLocation != null) {
			listGeoLocationVo = new ArrayList<>();
			for (GeoLocation geoLocation : listGeoLocation) {
				if (geoLocation != null) {
					
					GeoLocationVo geoLocationVo = new GeoLocationVo();
					geoLocationVo.setId(geoLocation.getId());
					geoLocationVo.setArea(geoLocation.getArea());
					geoLocationVo.setBranch(geoLocation.getBranch());
					geoLocationVo.setStreet(geoLocation.getStreet());
					geoLocationVo.setCity(geoLocation.getCity());
					geoLocationVo.setState(geoLocation.getState());
					geoLocationVo.setZip(geoLocation.getZip());
					geoLocationVo.setCountry(geoLocation.getCountry());
					geoLocationVo.setCreated(geoLocation.getCreated());
					geoLocationVo.setCreatedBy(geoLocation.getCreatedBy());
					geoLocationVo.setCreatedByTaskId(geoLocation.getCreatedByTaskId());
					geoLocationVo.setLastModified(geoLocation.getLastModified());
					geoLocationVo.setLastModifiedBy(geoLocation.getLastModifiedBy());
					listGeoLocationVo.add(geoLocationVo);
				}
				
			}
		}
		return listGeoLocationVo;
	}

	
}
