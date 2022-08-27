package com.alperArslan.springframeworkspgpetclinic.repositories;

import com.alperArslan.springframeworkspgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
}
