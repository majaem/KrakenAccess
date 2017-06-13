package com.github.majaem.KrakenAccess.requests;

import com.github.majaem.KrakenAccess.enums.AccessModifier;

/**
 * Represents the "File" part of the URl.
 * containing informations about: Version, Access and the specific file.
 * @author Marco Naﬂ
 * @version v0.1b
 */
public class KrakenFilePath {
	
	//
	// Fix fields of the File for URL
	//

	/** Version of the KrakenAPI*/
	private static final int VERSION = 0;
	
	/** Access Modifier e.g. private/public */
	private final AccessModifier accessModifier;
	
	/** Specific File e.g. Time for the ServerTimeRequest*/
	private final String specificFile;
	
	//
	// Constructor
	//
	
	/**
	 * Package protected constructor for creating a KrakenFilePath Object,
	 * which represents the path to the specific Request e.g. for ServerTimeRequests: /0/public/Time
	 * <br> Version = 0
	 * <br> Access= public 
	 * <br> specificFile = Time:
	 * @param accessModifier as {@link AccessModifier}. Possible values public/private
	 * @param specificFile as {@code String}. Represents the specific file/request e.g. "time" for server time.
	 */
	protected KrakenFilePath(AccessModifier accessModifier, String specificFile) {
		this.accessModifier = accessModifier;
		this.specificFile = specificFile;
	}
	
	//
	// Methods
	//
	
	/**
	 * Creates a String, representing the path of the file.
	 * @return the filePath as {@code String} e.g "/0/public/Time"
	 */
	protected final String getPath() {
		return String.format("/%d/%s/%s", VERSION, accessModifier.getUrlRepresentation(), specificFile);
	}
	
	//
	// Object Methods
	//

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "KrakenFilePath [" + getPath() + "]";
	}
}
