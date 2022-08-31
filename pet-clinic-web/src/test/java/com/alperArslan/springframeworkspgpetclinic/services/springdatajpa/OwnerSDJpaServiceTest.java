package com.alperArslan.springframeworkspgpetclinic.services.springdatajpa;

import com.alperArslan.springframeworkspgpetclinic.model.Owner;
import com.alperArslan.springframeworkspgpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;
    final String lastName = "arslan";
    final Long id = 1L;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(id).lastName(lastName).build();
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2,owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.findById(id);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(id);

        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().lastName(lastName).build();

        when(ownerRepository.save(any())).thenReturn(ownerToSave);

        Owner savedOwner = service.save(ownerToSave);

        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
        // these methods do not return anything. Thus, verify is used.
        service.delete(returnOwner);

        //default is 1 you don't need to specify it normally.
        verify(ownerRepository,times(1)).delete(any()); //verifies delete method is called one time.

    }

    @Test
    void deleteById() {
        service.deleteById(id);

        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner arslan = service.findByLastName(lastName);

        assertEquals(lastName, arslan.getLastName());

        //redundant but to see verify method example. Also, it may be used to see the mocking action is done successfully.
        verify(ownerRepository).findByLastName(any());
    }
}