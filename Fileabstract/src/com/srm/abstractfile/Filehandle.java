package com.srm.abstractfile;

import java.io.File;
import java.util.logging.Logger;

public class Filehandle implements Model{
	static Logger log = Logger.getLogger(Filehandle.class.getName());
	public static void main(String[] args) 
	{
		var rtobj=new File1();
		var lsobj=new File2();
		var skobj=new File3();
		
		var name1="file1.txt";
		var name2="file2.txt";
		var name3="file3.txt";
		
		var path="E:\\Vijayalakshmi I0025\\JAVA TRAINING\\Fileabstract";
		
		File[] file = new File(path).listFiles();
		 
		for(File filename:file)
		{
			if (filename.getName().contains(name1))
			{
				lsobj.fileread(filename);
			}
			else if(filename.getName().contains(name2))
			{
				rtobj.fileread(filename);
			}
			else if(filename.getName().contains(name3))
			{
				skobj.fileread(filename);
			}
			else
			{
				log.info("Parcel Not Registered");
			}	
		}
	}
}

