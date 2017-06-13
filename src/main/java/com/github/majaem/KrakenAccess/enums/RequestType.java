package com.github.majaem.KrakenAccess.enums;

import com.github.majaem.KrakenAccess.responses.Response;

/**
 * Enum for representing the Type of the Request and the corresponding Response class.
 * @author Marco Naﬂ
 * @version v0.1b
 */
public enum RequestType {
	
	//
	// Enum Values
	//
	
	SERVER_TIME(Response.class);

	//
	// Fields
	//
	
	/**
	 *  Response class for the corresponding Request. 
	 * This value is used for pojo mapping e.g. ServerTimeResponse for SERVER_TIME
	 */
	private final Class<? extends Response> responseClazz;
	
	//
	// Constructor
	//
	
	/** private constructor to create enum with additional Value*/
	private RequestType(Class<? extends Response> responseClazz) {
		this.responseClazz = responseClazz;
	}

	//
	// Getter
	//
	
	/**
	 * @return the responseClazz extending {@link Response}
	 */
	public Class<? extends Response> getResponseClazz() {
		return responseClazz;
	}
}
