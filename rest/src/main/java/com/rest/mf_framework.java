package com.rest;

import org.sikuli.script.*;
import org.sikuli.basics.Debug;


public class mf_framework {

	public mf_framework() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		String base_dir = "Y:/Regression/config/sikuli/";
		
		Screen s = new Screen();
        s.click(base_dir + "start.png");
        s.find(base_dir + "start_srch.png");
        s.type(base_dir + "start_srch.png","attachmate" + Key.ENTER);
        //Thread.sleep(30);
        //s.find(base_dir + "session_radio_button.PNG");
        s.click(s.wait(base_dir + "session_radio_button.PNG", 10));
        s.type(Key.ENTER);
        s.click(s.wait(base_dir + "choose_edp.PNG", 10));
        s.type(Key.ENTER);

        //s.find(base_dir + "generic_ok_button.png");
        //s.click(base_dir + "generic_ok_button.PNG");

	}

}
