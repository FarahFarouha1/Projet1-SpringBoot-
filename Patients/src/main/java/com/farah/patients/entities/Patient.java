package com.farah.patients.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
 @Id 
 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idPatient;
 private String nomPatient;
 private String prenomPatient;
 private Date datenaiss;
 public Patient() {
 super();
 }
public Patient( String nomPatient, String prenomPatient, Date datenaiss) {
	super();

	this.nomPatient = nomPatient;
	this.prenomPatient = prenomPatient;
	this.datenaiss = datenaiss;
}
public Long getIdPatient() {
	return idPatient;
}
public void setIdPatient(Long idPatient) {
	this.idPatient = idPatient;
}
public String getNomPatient() {
	return nomPatient;
}
public void setNomPatient(String nomPatient) {
	this.nomPatient = nomPatient;
}
public String getPrenomPatient() {
	return prenomPatient;
}
public void setPrenomPatient(String prenomPatient) {
	this.prenomPatient = prenomPatient;
}
public Date getDatenaiss() {
	return datenaiss;
}
public void setDatenaiss(Date datenaiss) {
	this.datenaiss = datenaiss;
}
@Override
public String toString() {
	return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
			+ ", datenaiss=" + datenaiss + "]";
}

}
