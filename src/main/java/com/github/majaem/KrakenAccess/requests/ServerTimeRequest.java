package com.github.majaem.KrakenAccess.requests;

import com.github.majaem.KrakenAccess.enums.AccessModifier;
import com.github.majaem.KrakenAccess.enums.RequestType;

public final class ServerTimeRequest extends PublicRequest {

	//
	// Fix fields for URL
	//
	
	/** Represents the specific file for ServerTImeRequest */
	private static final String FILE = "Time";

	//
	// Constructor
	//
	
	/** Creates an ServerTimeRequest */
	public ServerTimeRequest() {
		super(FILE, RequestType.SERVER_TIME);
	}
	
	

}
