package com.alperArslan.springframeworkspgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    private Pet pet;
}
