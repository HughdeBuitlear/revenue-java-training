package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private String Name;
    private Integer Id;
    private LocalDate DateofBirth;
    private Gender gender;
}
