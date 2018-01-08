package com.cts.mars;
import java.util.ArrayList;

import com.cts.mars.*;

public class caller {

	public caller() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ArrayList srcList = new ArrayList();;
		srcList.add("a");
		
		ArrayList trgList = new ArrayList();;
		trgList.add("b");

		String respData = "";

		db_comp dc = new db_comp();

		respData = dc.db_comp_m(srcList, trgList);

		
		
		//for (String temp : list1){
       // 	respData = respData + temp + "\n"; //output of MINUS between two result sets
		//}
		System.out.println(respData);

	}

}
