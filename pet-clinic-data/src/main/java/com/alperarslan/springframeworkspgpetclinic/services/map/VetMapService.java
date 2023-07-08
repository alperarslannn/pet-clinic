package com.alperarslan.springframeworkspgpetclinic.services.map;

import com.alperarslan.springframeworkspgpetclinic.model.Vet;
import com.alperarslan.springframeworkspgpetclinic.services.SpecialiyService;
import com.alperarslan.springframeworkspgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialiyService specialiyService;

    public VetMapService(SpecialiyService specialiyService) {
        this.specialiyService = specialiyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(!object.getSpecialities().isEmpty()){
            object.getSpecialities().forEach(specialiyService::save);
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
