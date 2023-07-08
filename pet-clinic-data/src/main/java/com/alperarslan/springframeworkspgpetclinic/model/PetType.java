package com.alperarslan.springframeworkspgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pet_types")
public class PetType extends BaseEntity{
    @Column(name = "pet_type_name")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
