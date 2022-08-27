package com.alperArslan.springframeworkspgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "pet_types")
public class PetType extends BaseEntity{
    @Column(name = "pet_type_name")
    private String name;
}
