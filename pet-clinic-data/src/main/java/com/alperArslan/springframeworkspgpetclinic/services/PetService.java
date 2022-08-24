package com.alperArslan.springframeworkspgpetclinic.services;

import com.alperArslan.springframeworkspgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
