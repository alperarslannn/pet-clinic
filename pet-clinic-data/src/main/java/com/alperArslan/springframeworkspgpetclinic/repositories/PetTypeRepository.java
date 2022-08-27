package com.alperArslan.springframeworkspgpetclinic.repositories;

import com.alperArslan.springframeworkspgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
