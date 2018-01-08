package com.cts.mars;

import org.sikuli.script.*;
import org.sikuli.basics.Debug;


public class click_click {

	public click_click() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		String base_dir = "Y:/Regression/config/sikuli/";
		
		Screen s = new Screen();
        
		int i = 1;
		
		while (i < 180) {
				s.click("/start.png");
				Thread.sleep(55000);
				i++;
		}
        
	}

}
