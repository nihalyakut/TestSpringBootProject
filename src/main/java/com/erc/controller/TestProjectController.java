package com.erc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erc.entity.PatientDTO;
import com.erc.service.TestService;


@RestController
public class TestProjectController {
	
	@Autowired
	private TestService tservice;
	
	@RequestMapping(value="/getPatientbyIdentificationno", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<PatientDTO> getPatient(@RequestParam String identificationno) {
		return tservice.getPatientsbyIdentificationno(identificationno);

	}
	
	@RequestMapping(value="/savePatient", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PatientDTO> savePatient(@RequestBody PatientDTO dto) {
		PatientDTO patient = tservice.savePatient(dto);
        if(patient != null){
            return new ResponseEntity(patient, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
	}


}
