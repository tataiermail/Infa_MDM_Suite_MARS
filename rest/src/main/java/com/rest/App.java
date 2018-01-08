package com.rest;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClientProtocolException, IOException
    {
        System.out.println( "Hello World from main!" );
        GET_caller gc = new GET_caller();
        gc.GET_caller();
        
        
    }
}
