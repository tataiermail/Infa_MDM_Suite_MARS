package com.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.internal.filter.ValueNode.JsonNode;



public class GET_caller {

	public static void GET_caller() throws ClientProtocolException, IOException {
		String url = "http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo";
		//String jsonPath = "$";
		String jsonPath = ".geonames[2].toponymName";
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		//request.addHeader("User-Agent", USER_AGENT);
		HttpResponse response = client.execute(request);

		System.out.println("Response Code : "
		                + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(
			new InputStreamReader(response.getEntity().getContent()));

		//StringBuffer result = new StringBuffer();
		String result= "";
		String line = "";
		while ((line = rd.readLine()) != null) {
			//result.append(line);
			result = result + line;
		}
		System.out.println(result.toString());
		System.out.println(result);
		
		
		//JsonNode jsonTag = JsonPath.read(jsonPath, line, JsonNode.class);
		JsonNode jsonNode = JsonPath.parse(result).read(jsonPath, JsonNode.class);
		System.out.println("Parsed Tag : "+ jsonNode);
	}



}
