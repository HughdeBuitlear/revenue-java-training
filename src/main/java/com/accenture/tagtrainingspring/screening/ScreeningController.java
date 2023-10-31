package com.accenture.tagtrainingspring.screening;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningDatabase screeningDatabase;

    @GetMapping("/screenings")
    public ArrayList<Screening> getScreenings() {
        return screeningDatabase.getScreenings();
    };
}