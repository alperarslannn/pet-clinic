package com.alperarslan.springframeworkspgpetclinic.repositories;

import com.alperarslan.springframeworkspgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
