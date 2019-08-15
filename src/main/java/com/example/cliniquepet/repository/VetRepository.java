package com.example.cliniquepet.repository;

import com.example.cliniquepet.entities.Vet;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Collection;

/**
 * mim
 * 15/08/2019
 * 15
 */
public interface VetRepository extends Repository<Vet, Integer> {

    /**
     * Retrieve all <code>Vet</code>s from the data store.
     *
     * @return a <code>Collection</code> of <code>Vet</code>s
     */
    //@Transactional(readOnly = true)
    //@Cacheable("vets")
    Collection<Vet> findAll() throws DataAccessException;



}
