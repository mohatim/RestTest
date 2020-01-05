package com.forJob.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.forJob.test.entities.FormatHistoriqueResponse;
import com.forJob.test.services.FormatHistoriqueService;

@RestController
public class FormatHistoriqueController {
	
	@Autowired
	private FormatHistoriqueService formatHistoriqueService;
	
	@GetMapping("/getFormatHistorique")
	public ResponseEntity<MappingJacksonValue> getFormatHistorique(){
		MappingJacksonValue formatHistorique = formatHistoriqueService.getFormatHistorique();
		return new ResponseEntity<>(formatHistorique,HttpStatus.OK);
	}

}
