package com.example.cliniquepet.repository;

import com.example.cliniquepet.entities.Visit;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * mim
 * 15/08/2019
 * 15
 */
public interface VisitRepository  extends Repository<Visit, Integer> {

    /**
     * Save a <code>Visit</code> to the data store, either inserting or updating it.
     *
     * @param visit the <code>Visit</code> to save
     */
    void save(Visit visit) throws DataAccessException;

    List<Visit> findByPetId(Integer petId);
}
