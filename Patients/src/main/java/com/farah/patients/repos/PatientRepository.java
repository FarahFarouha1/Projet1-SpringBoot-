package com.farah.patients.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farah.patients.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
