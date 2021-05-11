package com.srm.javatrainingex;

import java.io.BufferedReader;


import java.io.FileReader;
import java.util.logging.Logger;

public class FileReadBufferRead {
	static Logger log=Logger.getLogger(FileReadBufferRead.class.getName());
	public static void main(String[] args) throws Exception {
		try 
		{
		var br = new BufferedReader(new FileReader("E:\\Vijayalakshmi I0025\\JAVA TRAINING\\filesam.txt"));  
		String st;
		while ((st = br.readLine()) != null)
		{
		 log.info(st);
		}
		}
		catch (Exception e){
			log.info(e.getStackTrace()+" ");
		}
	}

}
