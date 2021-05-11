package com.srm.javatrainingex;

import java.io.File;

import java.io.FileReader;

import java.util.logging.Logger;

public class Readfile {
	static Logger log=Logger.getLogger( Readfile.class.getName());
	public static void main(String[] args) throws Exception {
		var file=new File("E:\\Readfile.docx");
		var fr =new FileReader(file);
			  
	    int i;
	    while ((i=fr.read()) != -1)
	    {
	      log.fine(""+(char) i);
	    }
	    fr.close();
	}

}
