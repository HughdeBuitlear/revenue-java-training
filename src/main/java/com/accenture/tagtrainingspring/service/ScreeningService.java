package com.accenture.tagtrainingspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDaoImpl;

@Service
public class ScreeningService {

    @Autowired
    private ScreeningDaoImpl screeningDaoImpl;

    
    public boolean isPatientScreening (Patient patient, Screening screening) {

        boolean ret = false;

        //if (screening.getScreeningId() == patient.getId() )ret = true;

        return ret;
    }

    public List<Screening> getScreenings(){
        return screeningDaoImpl.getScreenings();
    }
}