package com.example.cliniquepet.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

/**
 * mim
 * 15/08/2019
 * 15
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
    @Column(name = "visit_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotEmpty
    @Column(name = "description")
    private String description;

    @Column(name = "pet_id")
    private Integer petId;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }
}
