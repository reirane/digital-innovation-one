
package package com.gitlab.reirane.citiesapi.countries.repositories;

import package com.gitlab.reirane.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
