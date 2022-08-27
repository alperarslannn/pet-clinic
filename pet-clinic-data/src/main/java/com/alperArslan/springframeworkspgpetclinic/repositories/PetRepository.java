package com.alperArslan.springframeworkspgpetclinic.repositories;

import com.alperArslan.springframeworkspgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
