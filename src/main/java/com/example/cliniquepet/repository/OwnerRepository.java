package com.example.cliniquepet.repository;


import com.example.cliniquepet.entities.Owner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * mim
 * 15/08/2019
 * 15
 */
public interface OwnerRepository extends Repository<Owner, Long> {

    /**
     * Retrieve {@link Owner}s from the data store by last name, returning all owners
     * whose last name <i>starts</i> with the given name.
     * @param lastName Value to search for
     * @return a Collection of matching {@link Owner}s (or an empty Collection if none
     * found)
     */
    // TODO  : On peut effacer l'expression 'left join fetch owner.pets' de la requete et la changer avec  ==> fetch=FetchType.EAGER  dans l'entité Owner
    @Query("SELECT DISTINCT owner FROM Owner owner left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
    //@Transactional(readOnly = true)
    Collection<Owner> findByLastName(@Param("lastName") String lastName);


    /**
     * Retrieve an {@link Owner} from the data store by id.
     * @param id the id to search for
     * @return the {@link Owner} if found
     */
    @Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
    //@Transactional(readOnly = true)
    Owner findById(@Param("id") Integer id);

    /**
     * Save an {@link Owner} to the data store, either inserting or updating it.
     * @param owner the {@link Owner} to save
     */
    void save(Owner owner);



}
