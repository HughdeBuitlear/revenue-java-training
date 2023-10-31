package com.accenture.tagtrainingspring;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.service.ScreeningService;

@SpringBootApplication
public class TagTrainingSpringApplication {



	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");

		ScreeningDatabase screeningDatabase = new ScreeningDatabase (); 
		ScreeningService screeningSerivce = new ScreeningService(screeningDatabase);

		ArrayList<Screening> screenings = screeningSerivce.getScreenings();

		for (Screening screening : screenings) {
			System.out.println(screening.getPatientId().getName()+" has a cancer status of "+screening.isMalignant());
		}

		//System.out.println(patient1.getName()+" has a cancer status of "+screening1.isMalignant());
	}
}
