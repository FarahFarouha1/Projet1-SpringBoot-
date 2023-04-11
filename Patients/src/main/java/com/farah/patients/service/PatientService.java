package com.farah.patients.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.farah.patients.entities.Patient;

public interface PatientService {
Patient savePatient (Patient p);
Patient updatePatient (Patient p);
	void deletePatient (Patient p);
	 void deletePatientById(Long id);
	 Patient getPatient(Long id);
	List<Patient> getAllPatient();

	Page<Patient> getAllPatientsParPage(int page, int size);
	

}