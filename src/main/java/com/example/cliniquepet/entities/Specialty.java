package com.example.cliniquepet.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * mim
 * 15/08/2019
 * 15
 */
@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable{
}
