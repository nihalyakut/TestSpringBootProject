package com.erc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="PATIENT")
public class PatientDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5809032002655141574L;

	@Id 
	@SequenceGenerator(name="seqhdmcodevalue",sequenceName="seqhdmcodevalue")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqhdmcodevalue")               
	@Column(name = "PATIENTID", unique = true, nullable = false)
	@JsonProperty("patientid")
	private Long patientId;
	
	@Column(name = "PATIENTNO")
	@JsonProperty("patientno")
	private String patientNo;
	
	@Column(name = "IDENTIFICATIONNO")
	private String identificationNo;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "BIRTHDATE")
	private Date birthDate;
	
	@Column(name = "DEATHDATE")
	private Date deathDate;
	
	@Column(name = "FATHERNAME")
	private String fatherName;
	
	@Column(name = "MOTHERNAME")
	private String motherName;
	
	@Column(name = "MOTHERSMAIDENNAME")
	private String mothersMaidenName;
	
	@Column(name = "GENDER")
	private String gender;

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}

	public String getIdentificationNo() {
		return identificationNo;
	}

	public void setIdentificationNo(String identificationNo) {
		this.identificationNo = identificationNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMothersMaidenName() {
		return mothersMaidenName;
	}

	public void setMothersMaidenName(String mothersMaidenName) {
		this.mothersMaidenName = mothersMaidenName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

