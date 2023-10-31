package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

import com.accenture.tagtrainingspring.patient.Patient;

public class Screening {
       public Screening() {
    };

    private String name;
    private Integer screeningId;
    private Patient patient;
    private LocalDate dateOfScreening;
    private Boolean malignant;

    public String getName() {
        return this.name;
    };

    public Integer getScreeningId() {
        return this.screeningId;
    };

    public Patient getPatientId() {
        return this.patient;
    };

    public LocalDate getDateOfScreening() {
        return this.dateOfScreening;
    };

    public Boolean isMalignant() {
        return this.malignant;
    };

    public void setName(String name) {
        this.name = name;
    };

    public void setScreeningId(Integer screeningId) {
        this.screeningId = screeningId;
    };

    public void setPatientId(Patient patient) {
        this.patient = patient;
    };

    public void setDateOfScreening(LocalDate dateOfScreening) {
        this.dateOfScreening = dateOfScreening;
    };

    public void setMalignant(Boolean malignant) {
        this.malignant = malignant;
    };
}
