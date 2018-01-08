package com.rest;

import org.sikuli.script.*;
import org.sikuli.basics.Debug;


public class mf {

	public mf() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FindFailed {
		Screen s = new Screen();
        s.click("C:/sikuli/start.png");
        s.find("C:/sikuli/start_srch.png");
        s.type("C:/sikuli/start_srch.png","cmd"+ Key.ENTER);
        //s.type("C:/Users/tatai/workspace/01_MARS_MISC/src/main/resources/pics/prompt.PNG", "calc"+ Key.ENTER);



	}

}
