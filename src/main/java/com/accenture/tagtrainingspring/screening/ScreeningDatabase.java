package com.accenture.tagtrainingspring.screening;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.accenture.tagtrainingspring.patient.Patient;

@Component
public class ScreeningDatabase {

    ArrayList<Screening> screenings = new ArrayList<Screening>();

    public ArrayList<Screening> getScreenings() {

        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();

        patient1.setName("person 1");
        patient1.setId(1);

        patient2.setName("person 2");
        patient2.setId(2);

        patient3.setName("person 3");
        patient3.setId(3);

        Screening screening1 = new Screening();
        Screening screening2 = new Screening();
        Screening screening3 = new Screening();

        screening1.setMalignant(false);
        screening1.setPatientId(patient1);

        screening2.setMalignant(false);
        screening2.setPatientId(patient2);

        screening3.setMalignant(false);
        screening3.setPatientId(patient3);

        ArrayList<Screening> screenings = new ArrayList<Screening>();

        screenings.add(screening1);
        screenings.add(screening2);
        screenings.add(screening3);

        return screenings;
    }

}
