package com.forJob.test.entities;

public class FormatHistoriqueEnqteSMRResponse extends FormatHistoriqueEnqteResponse{

	private String id;
	
	private boolean dateDuConcubinageEstOblig;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dateDuConcubinageEstOblig
	 */
	public boolean isDateDuConcubinageEstOblig() {
		return dateDuConcubinageEstOblig;
	}

	/**
	 * @param dateDuConcubinageEstOblig the dateDuConcubinageEstOblig to set
	 */
	public void setDateDuConcubinageEstOblig(boolean dateDuConcubinageEstOblig) {
		this.dateDuConcubinageEstOblig = dateDuConcubinageEstOblig;
	}
	
}
