package com.github.majaem.KrakenAccess.enums;

/**
 * Enum for representing the Access Modifier e.g. private/public.
 * @author Marco Naﬂ
 * @version v0.1b
 */
public enum AccessModifier {
	
	//
	// Enum Values
	//
	
	PUBLIC("public"),
	PRIVATE("private");
	
	//
	// Fields
	//
	
	/** Representation of the AccesModfier as a part of a URL */
	private final String urlRepresentation;
	
	//
	// Constructor
	//
	
	/** private constructor to create enum with additional Value*/
	private AccessModifier(String urlRepresentation) {
		this.urlRepresentation = urlRepresentation;
	}
	
	//
	// Getter
	//
	
	/**
	 * @return the urlRepresentation
	 */
	public final String getUrlRepresentation() {
		return urlRepresentation;
	};
}
