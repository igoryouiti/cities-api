package com.github.igoryouiti.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.igoryouiti.citiesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
