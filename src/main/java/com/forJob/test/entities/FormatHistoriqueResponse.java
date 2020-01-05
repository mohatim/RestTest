package com.forJob.test.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;

public class FormatHistoriqueResponse {

	private String nom;
	
	private String prenom;
	
	private int age;
	
	@JsonFilter("FormatHistoriqueEnqteResponseFilter")
	private List<FormatHistoriqueEnqteResponse> formatHistoriqueEnqtes;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the formatHistoriqueEnqtes
	 */
	public List<FormatHistoriqueEnqteResponse> getFormatHistoriqueEnqtes() {
		return formatHistoriqueEnqtes;
	}

	/**
	 * @param formatHistoriqueEnqtes the formatHistoriqueEnqtes to set
	 */
	public void setFormatHistoriqueEnqtes(List<FormatHistoriqueEnqteResponse> formatHistoriqueEnqtes) {
		this.formatHistoriqueEnqtes = formatHistoriqueEnqtes;
	}
	
}
