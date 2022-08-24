package com.alperArslan.springframeworkspgpetclinic.services;

import com.alperArslan.springframeworkspgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
