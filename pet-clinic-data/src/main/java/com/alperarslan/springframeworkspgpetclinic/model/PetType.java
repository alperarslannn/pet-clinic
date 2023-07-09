package com.alperarslan.springframeworkspgpetclinic.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
    @Builder
    public PetType(Long id, String name){
        super(id);
        this.name = name;
    }

    @Column(name = "pet_type_name")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
