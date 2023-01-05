package com.github.sadiker.IstanbulAPI.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.github.sadiker.IstanbulAPI.models.district.District;
import com.github.sadiker.IstanbulAPI.models.district.dto.DistrictDto;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

    @Query("FROM District d WHERE LOWER(d.continent) = LOWER(:#{#param})")
    List<District> findDistrictByContinent(@Param("param") String continent);

    Optional<District> findByName(String name);

    @Query("FROM District WHERE population >= :param")
    List<District> findDistrictByDescPopulation(@Param("param") Long population);

    @Query("FROM  District  WHERE  population >= :#{#districtDto.population} AND  continent = :#{#districtDto.continent}  ")
    List<District> getByPopulationAndContinent(@Param("districtDto") DistrictDto districtDto);

    @Query("from District d where population >= :population and LOWER(d.continent) = LOWER(:#{#continent}) ")
    List<District> getByPopulationAndContinentBrowser(@Param("population") Long population,@Param("continent")  String continent);
}
