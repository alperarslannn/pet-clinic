package com.alperArslan.springframeworkspgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Vet extends Person{
    @OneToMany
    private Set<Speciality> specialities = new HashSet<>();
}
