package com.accenture.tagtrainingspring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;

@Service
public class ScreeningService {

    @Autowired
    private ScreeningDatabase screeningDatabase;

    public ScreeningService(){}; 

    public ScreeningService(ScreeningDatabase screeningDatabase) {
        this.screeningDatabase = screeningDatabase;
    }; 
    

    public boolean isForPatient(Patient patient, Screening screening) {

        boolean ret = false;

        if (screening.getPatientId().getId() == patientId().getId())
            ret = true;

        return ret;
    }

    public ArrayList<Screening> getScreenings(){
        return this.screeningDatabase.getScreenings();
    }
}