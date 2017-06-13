package com.github.majaem.KrakenAccess.requests;

import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.majaem.KrakenAccess.enums.RequestType;
import com.github.majaem.KrakenAccess.responses.Response;

/**
 * Package protected Class, which Represents the basis of all Kraken Requests.
 * @author Marco Naﬂ
 * @version v0.1b
 */
class Request {
	
	//
	// Fix fields for URL
	//
	
	/** Protocol of the URL e.g. https, http,...*/
	private static final String PROTOCOL = "https";
	
	/** host of the URL */
	private static final String HOST = "api.kraken.com";

	//
	// Fields for specific Requests (set by the infants)
	//
	
	/** Version as a part of the "file" of the URL */
	private final KrakenFilePath file;

	//
	// Fields for response mapping:
	//
	
	/** Object mapper to map the Json response to {@link Response} (POJO) */
	private static final ObjectMapper mapper = new ObjectMapper();
	
	/** {@link RequestType} of the specific Request*/
	private final RequestType requestType;

	//
	// Constructor
	//
	
	/**
	 * Package protected constructor.
	 * @param file as {@link KrakenFilePath}
	 * @param requestType as {@link RequestType}
	 */
	protected Request(KrakenFilePath file, RequestType requestType) {
		this.requestType = requestType;
		this.file = file;
	} 
	
	//
	// Methods
	//
	
	/**
	 * Method for sending the specific request.
	 * @since v0.1
	 * @return Response of the Request
	 * @throws Exception 
	 */
	Response send() throws Exception {
		synchronized (mapper) {
			URL url = new URL(PROTOCOL, HOST, file.getPath());
			Response response = mapper.readValue(url, requestType.getResponseClazz());
			return response;
		}
	}

	//
	// Object specific methods
	//
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request ["
					+ "protocol=" + PROTOCOL
					+ ", host=" + HOST
					+ ", file=" + file 
					+ ", requestType=" + requestType 
				+ "]";
	}	
	
}
