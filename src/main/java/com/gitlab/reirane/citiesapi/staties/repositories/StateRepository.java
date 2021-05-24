package com.gitlab.reirane.citiesapi.staties.repositories;

import com.gitlab.reirane.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
