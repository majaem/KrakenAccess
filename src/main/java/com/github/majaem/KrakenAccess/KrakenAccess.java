package com.github.majaem.KrakenAccess;

import com.github.majaem.KrakenAccess.requests.ServerTimeRequest;
import com.github.majaem.KrakenAccess.responses.results.ServerTimeResult;

public class KrakenAccess {

	public static void main(String[] args) {
		// Main Method for Test until Requests/Responses are implemented
		System.out.println(new ServerTimeRequest().send());
//		com.github.majaem.KrakenAccess.responses.results.Result x = new ServerTimeResult();
	}
}
