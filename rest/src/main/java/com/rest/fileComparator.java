package com.rest;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import org.apache.commons.io.*;
import org.apache.http.client.ClientProtocolException;


public class fileComparator {
	

    /**
     * List all the files under a directory
     * @param directoryName to be listed
     * @throws IOException 
     */
    public static void listFiles(String directoryName, String file_regex) throws IOException{
        File directory = new File(directoryName);
        final String file_reg = file_regex;
        //get all the files from a directory
        //File[] fList = directory.listFiles();

        File[] fList = directory.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String name) {
                return name.matches(file_reg);
            }
        });
        
        String f1 = "";
        String f2 = "";
    	int i = 3;
    	File FirstFile = new File(f1);
    	File file1 = new File(f1);
    	File file2 = new File(f2);
        
        for (File file : fList){
            if (file.isFile() && (i % 2 != 0) ){   //odd numbered files
                f1 = directoryName + file.getName();
                //System.out.println("f1 " + f1);
                //System.out.println("i =" + i + " " + (i % 2) + "--");
                		
                	if (i == 3) {
                		FirstFile = new File(f1);
                	}
                
                
            }
            if (file.isFile() && (i % 2 == 0) ){   //even numbered files
                f2 = directoryName + file.getName();
                //System.out.println("f2 " + f2);
                //System.out.println("i =" + i + " "+ (i % 2) + "--");
            }
            
           if (i != 3 ){
            	file1 = new File(f1);
            	file2 = new File(f2);
            	
            	//System.out.println("inside Compare block");
            	
    			boolean isTwoEqual = FileUtils.contentEquals(file1, file2);
    		    if(isTwoEqual)
    		    {
    		    	System.out.println("TWO FILES EQUAL " + file1.getName() + " - " + file2.getName());
    		    }
    		    else {
    		    	System.out.println( "FILE NOT SAME " + file1.getName() + " - " + file2.getName() );
    		    }
           }
            
            i++;
        }
        
        //if last file is odd numbered, then:
        file1 = new File(f1);
        boolean is2Equal = FileUtils.contentEquals(file1, FirstFile);
	    if(is2Equal)
	    {
	    	System.out.println("TWO FILES EQUAL " + file1.getName() + " - " + FirstFile.getName());
	    }
	    else {
	    	System.out.println( "FILE NOT SAME " + file1.getName() + " - " + FirstFile.getName() );
	    }
        
        
     }
        




	 public static void main( String[] args ) throws ClientProtocolException, IOException
	    {
	        System.out.println( "Hello World from main!" );
	        
	        String path = "//kyshared/epost/QA/SIT/Regression/temp/";
	        String file_pattern = "em_prf_by_cont_id.*";
	        listFiles(path, file_pattern);
	    }

}
