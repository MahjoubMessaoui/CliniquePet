package com.example.cliniquepet.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * mim
 * 15/08/2019
 * 15
 */
@MappedSuperclass
public class NamedEntity extends BaseEntity {
    @Column(name="name")
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
