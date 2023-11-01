package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningDaoImpl ScreeningDaoImpl;

    @GetMapping("/screenings")
    public List<Screening> getScreenings() {
        return ScreeningDaoImpl.getScreenings();
    };

        @GetMapping("/screenings")
    public List<Screening> getScreenings() {
        return ScreeningDaoImpl.getScreenings();
    };
}