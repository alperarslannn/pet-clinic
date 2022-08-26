package com.alperArslan.springframeworkspgpetclinic.services.map;

import com.alperArslan.springframeworkspgpetclinic.model.Vet;
import com.alperArslan.springframeworkspgpetclinic.services.SpecialiyService;
import com.alperArslan.springframeworkspgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialiyService specialiyService;

    public VetServiceMap(SpecialiyService specialiyService) {
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
        if(object.getSpecialities().size() > 0){
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
