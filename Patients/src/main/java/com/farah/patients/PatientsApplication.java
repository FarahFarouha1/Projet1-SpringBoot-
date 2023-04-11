package com.farah.patients;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.farah.patients.entities.Patient;
import com.farah.patients.service.PatientService;

@SpringBootApplication
public class PatientsApplication implements CommandLineRunner{

	@Autowired
	PatientService patientService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PatientsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	patientService.savePatient(new Patient("aymen", "dayah", new Date()));
	patientService.savePatient(new Patient("karim", "beahmed", new Date()));
	patientService.savePatient(new Patient("yasmin", "messadi", new Date()));
}
}