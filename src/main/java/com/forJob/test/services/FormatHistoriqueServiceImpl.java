package com.forJob.test.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.forJob.test.entities.FormatHistoriqueEnqteLCFResponse;
import com.forJob.test.entities.FormatHistoriqueEnqteResponse;
import com.forJob.test.entities.FormatHistoriqueEnqteSMRResponse;
import com.forJob.test.entities.FormatHistoriqueResponse;

@Service
public class FormatHistoriqueServiceImpl implements FormatHistoriqueService{

	private FormatHistoriqueResponse formatHistoriqueResponse;
	
	
	public FormatHistoriqueServiceImpl() {
		super();
		formatHistoriqueResponse = new FormatHistoriqueResponse();
		formatHistoriqueResponse.setNom("HATIM");
		formatHistoriqueResponse.setPrenom("Mohammed");
		formatHistoriqueResponse.setAge(27);
		
		FormatHistoriqueEnqteResponse formatHistoriqueEnqteResponse1 = getFormatHistoriqueEnqteLCFResponse();
		FormatHistoriqueEnqteResponse formatHistoriqueEnqteResponse2 = getFormatHistoriqueEnqteSMRResponse();
		FormatHistoriqueEnqteResponse formatHistoriqueEnqteResponse3 = getFormatHistoriqueEnqteResponse();
		formatHistoriqueResponse.setFormatHistoriqueEnqtes(Arrays.asList(formatHistoriqueEnqteResponse3));
	}


	private FormatHistoriqueEnqteResponse getFormatHistoriqueEnqteSMRResponse() {
		FormatHistoriqueEnqteSMRResponse formatHistoriqueEnqteSMRResponse = new FormatHistoriqueEnqteSMRResponse();
		formatHistoriqueEnqteSMRResponse.setId("2");
		formatHistoriqueEnqteSMRResponse.setHeaders("Hello World 2");
		formatHistoriqueEnqteSMRResponse.setType("SMR");
		formatHistoriqueEnqteSMRResponse.setDateDuConcubinageEstOblig(true);
		formatHistoriqueEnqteSMRResponse.setNumEquete("2");
		return formatHistoriqueEnqteSMRResponse;
	}


	private FormatHistoriqueEnqteResponse getFormatHistoriqueEnqteLCFResponse() {
		FormatHistoriqueEnqteLCFResponse formatHistoriqueEnqteLCFResponse = new FormatHistoriqueEnqteLCFResponse();
		formatHistoriqueEnqteLCFResponse.setType("LCF");
		formatHistoriqueEnqteLCFResponse.setHeaders("Hello Worlds");
		formatHistoriqueEnqteLCFResponse.setId("1");
		formatHistoriqueEnqteLCFResponse.setNumEquete("1");
		formatHistoriqueEnqteLCFResponse.setNomDUsage("Moha");
		return formatHistoriqueEnqteLCFResponse;
	}
	
	private FormatHistoriqueEnqteResponse getFormatHistoriqueEnqteResponse() {
		FormatHistoriqueEnqteResponse formatHistoriqueEnqteResponse = new FormatHistoriqueEnqteResponse();
		formatHistoriqueEnqteResponse.setNumEquete("3");
		formatHistoriqueEnqteResponse.setType("VIE");
		return formatHistoriqueEnqteResponse;
	}


	@Override
	public MappingJacksonValue getFormatHistorique() {
		SimpleFilterProvider filterProvider = new SimpleFilterProvider();
		filterProvider.addFilter("FormatHistoriqueEnqteResponseFilter", SimpleBeanPropertyFilter.filterOutAllExcept("numEquete","type"));
		ObjectMapper om = new ObjectMapper();
		om.setFilterProvider(filterProvider);
		
		SimpleFilterProvider filterProvider2 = new SimpleFilterProvider();
		filterProvider2.addFilter("FormatHistoriqueEnqteResponseFilter", SimpleBeanPropertyFilter.filterOutAllExcept("type"));
		ObjectMapper om2 = new ObjectMapper();
		om2.setFilterProvider(filterProvider2);
		MappingJacksonValue mapping = new MappingJacksonValue(formatHistoriqueResponse);
		mapping.setFilters(filterProvider2);
		return mapping;
	}

}
