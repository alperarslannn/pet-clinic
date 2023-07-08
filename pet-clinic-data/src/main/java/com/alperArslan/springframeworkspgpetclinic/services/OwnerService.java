package com.alperArslan.springframeworkspgpetclinic.services;

import com.alperArslan.springframeworkspgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
