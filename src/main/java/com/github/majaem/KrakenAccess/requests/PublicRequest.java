package com.github.majaem.KrakenAccess.requests;

import com.github.majaem.KrakenAccess.enums.AccessModifier;
import com.github.majaem.KrakenAccess.enums.RequestType;

/**
 * Package protected Class, which Represents the basis of all public Kraken Requests.
 * @author Marco Naﬂ
 * @version v0.1b
 */
class PublicRequest extends Request {
	
	//
	// Fix fields for URL
	//
	
	/** Set AccessModifier for all publicRequests to public. */
	private static final AccessModifier ACCESS_MODIFIER = AccessModifier.PUBLIC;
	
	//
	// Constructor
	//
	
	protected PublicRequest(String specificFile, RequestType requestType) {
		super(new KrakenFilePath(ACCESS_MODIFIER, specificFile), requestType);
	}

}
