package com.srm.javatrainingex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws Exception {
		File file=new File("E:\\Readfile.docx");
		FileReader fr =new FileReader(file);
			  
	    int i;
	    while ((i=fr.read()) != -1)
	    {
	      System.out.print((char) i);
	    }
	    fr.close();
	}

}
