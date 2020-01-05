package com.forJob.test.services;

import org.springframework.http.converter.json.MappingJacksonValue;

import com.forJob.test.entities.FormatHistoriqueResponse;

public interface FormatHistoriqueService {

	public MappingJacksonValue getFormatHistorique();
}
