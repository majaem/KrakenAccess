package com.github.majaem.KrakenAccess.responses;

/**
 * Pojo class, which Represents the basis of all Kraken Requests.
 * @author Marco Naﬂ
 * @version v0.1b
 */
public class Response {

	//
	// Fields
	//
	
	private String[] error;

	//
	// Constructor
	//
	
	/** Package protected constructor to hide default constructor*/
	protected Response() {}

	//
	// Setter
	//

	/**
	 * @param error the error to set
	 */
	public void setError(String[] error) {
		this.error = error;
	}
}
