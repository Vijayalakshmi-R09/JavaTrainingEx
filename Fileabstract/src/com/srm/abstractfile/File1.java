package com.srm.abstractfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class File1 implements FileRead{
	final Logger log= Logger.getLogger(File1.class.getName());
	@Override
	public void fileread(File file) {
		log.info("\n\n"+file.getAbsolutePath());
		log.info("\nContents of File 1: \n");
		//Store validated Records in ArrayList
		ArrayList<String> lserror = new ArrayList<>();
		ArrayList<String> lsvalid = new ArrayList<>();
		try (var br = new BufferedReader(new FileReader(file)))
        {
            String line;
            var arr = new String[25];
            var i=0;
            	
            while ((line = br.readLine()) != null) 
            {
            	arr[i]=line;
            	i++;
               
            }
            for(i=0;i<arr.length;i++)
            {
            	 
            	String[] aline;
            	try
            	{
               	aline=arr[i].split("-");
               	
               	if(aline.length<4)
               	{
               		lserror.add(arr[i]);
              var writer = new FileWriter("C:\\Users\\Admin\\Desktop\\java\\error.csv");	
              for (String s:lserror)
              {		
      			String[] split2 = s.split("-");
      			writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(",")));
                writer.write("\n");
                log.info("errored records");
                log.info("\n" +s);
                log.info("\n\nWritten to error csv file");
      		}
              
              writer.close();
               	}
               	else
               	{
               		log.fine("correct records: " +arr[i]);
               		lsvalid.add(arr[i]);
                    var writer = new FileWriter("C:\\Users\\Admin\\Desktop\\Java\\Files\\valid.csv");	 
                    for (String s:lsvalid)
            		{
            			
            			String[] split2 = s.split(",");
            			writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(",")));
                      writer.write("\n");
                      log.info("Valid  records");
                      log.info("\n"+s);
                      log.info("\n\nWritten to Valid csv file");
            		}
                    
                    writer.close();
             	}
            	}
            	catch(NullPointerException e)
            	{
            		log.info("nulll in array");
            	}
            }
        } catch (IOException e) 
		{
            e.printStackTrace();
        }
		
		}
        }
