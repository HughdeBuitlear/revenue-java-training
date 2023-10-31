package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {
    public Patient() {
    }

    private String Name;
    private Integer Id;
    private LocalDate DateofBirth;
    private Gender gender;

    public String getName() {
        return this.Name;
    }

    public Integer getId() {
        return this.Id;
    };

    public LocalDate getDateofBirth() {
        return this.DateofBirth;
    };

    public Gender getGender() {
        return this.gender;
    };

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    };

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    };

    public void setGender(Gender gender) {
        this.gender = gender;
    };
}
