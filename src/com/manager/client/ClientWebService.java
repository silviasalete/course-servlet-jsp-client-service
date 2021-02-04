package com.manager.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class ClientWebService {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		String content = Request
			.Post("http://localhost:8080/manager/companies")
			.execute().returnContent()
			.asString();
		
		System.out.println(content);
	}
}
