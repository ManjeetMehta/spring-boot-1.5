package com.sp.mehta.applications.service;

import java.util.List;

import com.sp.mehta.applications.common.vo.GeoLocationVo;


public interface GeoLocationService {

	Integer createGeoLocation(GeoLocationVo geoLocationVo);
	
	GeoLocationVo readGeoLocation(Integer id);
	
	Boolean updateGeoLocation (GeoLocationVo geoLocationVo);
	
	Boolean deleteGeoLocation (Integer id);
	
	List<GeoLocationVo> listGeoLocation();
}
