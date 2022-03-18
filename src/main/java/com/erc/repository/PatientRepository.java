package com.erc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erc.entity.PatientDTO;

@Repository
public interface PatientRepository extends JpaRepository<PatientDTO, Long>  {
	
	List<PatientDTO> findByIdentificationNo(String identificationno);

}
