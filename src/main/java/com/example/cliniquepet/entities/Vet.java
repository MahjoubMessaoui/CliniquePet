package com.example.cliniquepet.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * mim
 * 15/08/2019
 * 15
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties;


}
