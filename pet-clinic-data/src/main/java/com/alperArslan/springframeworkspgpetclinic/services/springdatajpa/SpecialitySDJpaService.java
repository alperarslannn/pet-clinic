package com.alperArslan.springframeworkspgpetclinic.services.springdatajpa;

import com.alperArslan.springframeworkspgpetclinic.model.Speciality;
import com.alperArslan.springframeworkspgpetclinic.repositories.SpecialityRepository;
import com.alperArslan.springframeworkspgpetclinic.services.SpecialiyService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialiyService {
    private final SpecialityRepository specialityRepository;

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
