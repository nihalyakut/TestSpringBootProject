package com.erc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erc.entity.PatientDTO;
import com.erc.repository.PatientRepository;

@Service
public class TestService {
	
    @Autowired
    private PatientRepository prepository;
	
	public PatientDTO savePatient(PatientDTO dto) {
		return prepository.save(dto);
	}
	
	public List<PatientDTO> getPatientsbyIdentificationno(String identificationno) {
		return prepository.findByIdentificationNo(identificationno);
	}


}
