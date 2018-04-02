package com.sp.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.sp.mehta.applications.model.GeoLocation;

public interface GeoLocationRepository extends CrudRepository<GeoLocation, Integer>{

}
