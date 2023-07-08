package com.alperarslan.springframeworkspgpetclinic.repositories;

import com.alperarslan.springframeworkspgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
