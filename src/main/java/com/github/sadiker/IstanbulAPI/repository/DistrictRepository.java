package com.github.sadiker.IstanbulAPI.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.github.sadiker.IstanbulAPI.models.district.District;

@Repository
public interface DistrictRepository  extends JpaRepository<District,Long> {



}
