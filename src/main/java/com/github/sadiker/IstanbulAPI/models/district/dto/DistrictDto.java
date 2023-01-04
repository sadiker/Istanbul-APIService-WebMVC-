package com.github.sadiker.IstanbulAPI.models.district.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sadiker.IstanbulAPI.models.district.Continent;

public class DistrictDto {

    @JsonProperty("nüfus")
    private Long population;

    @JsonProperty("kıta")
    public Continent continent;

    public DistrictDto() {
    }

    public DistrictDto(Long population, Continent continent) {
        this.population = population;
        this.continent = continent;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

}
