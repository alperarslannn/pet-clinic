package com.alperArslan.springframeworkspgpetclinic.services;


import com.alperArslan.springframeworkspgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
