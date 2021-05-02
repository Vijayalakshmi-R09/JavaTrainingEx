package com.srm.javatrainingex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadBufferRead {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Readfile.docx");
		  
		BufferedReader br = new BufferedReader(new FileReader(file));
		  
		String st;
		while ((st = br.readLine()) != null)
		{
		 System.out.println(st);
		}
	}

}
