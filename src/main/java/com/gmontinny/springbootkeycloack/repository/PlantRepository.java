package com.gmontinny.springbootkeycloack.repository;

import com.gmontinny.springbootkeycloack.model.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
