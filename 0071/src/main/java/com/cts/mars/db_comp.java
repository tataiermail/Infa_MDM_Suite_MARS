package com.cts.mars;

//import java.io.*;
import java.util.ArrayList;
import java.util.Set;

public class db_comp {
	
	public void db_comp(){}

	public String db_comp_m(ArrayList<String> srcList, ArrayList<String> trgList) {
		ArrayList<String> srcL = new ArrayList(srcList);
		ArrayList<String> trgL = new ArrayList(trgList);
		String respData = "";
		
		srcL.removeAll(trgL); //MINUS
		
		for (String temp : srcL){
        	respData = respData + temp + "\n"; //output of MINUS between two result sets
		}
		//System.out.println(respData);
		return respData;
	}

}
