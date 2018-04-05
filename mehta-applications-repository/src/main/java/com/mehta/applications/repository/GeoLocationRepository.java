package com.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.mehta.applications.model.GeoLocation;

public interface GeoLocationRepository extends CrudRepository<GeoLocation, Integer>{

}
