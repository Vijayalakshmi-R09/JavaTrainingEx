package com.example.fileabstract;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class CarFileHandler extends BaseFilerReader {
    final Logger log= Logger.getLogger(CarFileHandler.class.getName());

    double cost=0;
    Date d=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
    String loc=location;
    List<String> successList=new ArrayList<>();
    List<String> errorList=new ArrayList<>();
    List<String> fileNames=new ArrayList<>();
    File[] file=new File(loc).listFiles();
    @Override
    public void readFileNames() {
       for(File f:file){
           if(f!=null)
           {
            fileNames.add(f.getName());
           }
       }
       if(!fileNames.isEmpty())
       {
        log.info("File Names Available are : ");
        fileNames.forEach(System.out::println);
       }
       else{
           log.info("No Files Available");
       }
    }
    String path;
    String headline="";
    String[] value;
    String nline;
    String vals;
    @Override
    public void readFileContent() throws InCorrectDateOfManufacturerException, HeaderCostNotMatchingException, IOException {
      
      log.info("Files Available are : ");
      for(int i=0;i<fileNames.size();i++)
      {
          System.out.println((i+1)+" . "+fileNames.get(i));
      }
      log.info("Enter the Option to Read the File : ");
      Scanner sc=new Scanner(System.in);
      int op=sc.nextInt();
      path=loc+"\\"+fileNames.get(op-1);
      String[] header;
      try {
        log.info(path);
        BufferedReader br=new BufferedReader(new FileReader(path));
        String data;
        
        try{
            String headerLine=Files.readAllLines(Paths.get(path)).get(0);
            header=headerLine.split("%%");

            for(int i=0;i<header.length;i++)
            {
                headline=headline+header[i]+" ";
            }
            System.out.println(header.length);
            // System.out.println(headline);
            // System.out.print("Date Time : "+header[0].length()+" "+"OEM Manufacturer Name "+header[1].length()+" "+
            // "Number of Records "+header[2].length()+" "+"File Sequence "+header[3].length()+" "+"Total Cost "+header[4].length());
            if(header[0].length()!=17)
            {
                throw new InCorrectDateOfManufacturerException(header[0]);
            }
             System.out.println(header[4].length());
             if(header[4].length()>=11)
            {
                throw new HeaderCostNotMatchingException(header[4]);
            }
             if(header.length==4&&header[0].length()==17&&header[1].length()==20&&header[2].length()<=6&&header[3].length()==3&&header[4].length()<=10)
             {
                log.info("Incorrect Header Format");
             }
            log.info("");
            while((data=br.readLine())!=null)
            {
                nline="";
                if(data.equals("05062021 16:59:04%%SuperToughGlass%%10%%001%%1234.5"))
                {
                    continue;
                }
                else
                {
                    value=data.split("%%");
                    for(int i=0;i<value.length;i++)
                    {
                        nline=nline+value[i]+" ";
                       
                    }
                    Date date=new Date();
                    String str1=sdf.format(date);
                    long diffInMillies=0,diff=0;
                    try {
                       Date cd = sdf.parse(str1);
                       Date od=sdf.parse(value[3]);
                       diffInMillies= Math.abs(cd.getTime() - od.getTime());
                       diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                    } catch (ParseException e) {
                        
                        e.printStackTrace();
                    }
                    log.info(diff+" ");
                    cost=cost+Double.parseDouble(value[7]);
                    log.info(cost+"");
                    System.out.println(value[0].length()+" "+value[1].length()+" "+value[2].length()+" "
                    +value[3].length()+" "+value[4].length()+" "+value[5].length()+" "+
                    value[6].length()+" "+value[7].length()+" ");
                    if(diff<=30 && diff!=0 && value.length==8&&value[0].length()<=5&&value[1].length()==16&&
                    value[2].length()<=20&&value[3].length()==8&&value[4].length()==1&&value[5].length()<=18&&value[6].length()<=5&&value[7].length()<=10&&value[2].matches("^[0-9]*$" ))
                    {
                        successList.add(nline);
                    }
                    else{
                        errorList.add(nline);
                    }

                }
                vals=String.format("%.1f", cost);
                log.info(vals);
            }
            if(vals.equals(header[4]))
            {
                log.info("The cost in the header is equal to sum of all the content details cost");
            }
            else{
               log.info("The cost in the header is not equal to sum of all the content details cost");
            }
        }catch(IOException  e)
        {
            e.printStackTrace();
        }
       br.close( );
    } catch (FileNotFoundException e) {
        
        e.printStackTrace();
    }
      
      sc.close( );
    }

    @Override
    public void writeFileContent() {
        String wpath=path.replace("txt", "csv");
        try {
            FileWriter fWriter=new FileWriter(wpath);
            fWriter.append("Date Time"+" ");
            fWriter.append("OEM Manufacturer Name"+" ");
            fWriter.append("Number of Records"+" ");
            fWriter.append("File Sequence"+" ");
            fWriter.append("Total Cost"+"\n");
            fWriter.append(headline+"\n");
            fWriter.append("ID"+"\t");
            fWriter.append("Category"+"\t");
            fWriter.append("SKU"+"\t");
            fWriter.append("DateofManufacturer"+"\t");
            fWriter.append("ISFragile"+"\t");
            fWriter.append("ModelNumber"+"\t");
            fWriter.append("Color"+"\t");
            fWriter.append("Cost"+"\t");
            fWriter.append("\n");
            for(int i=0;i<successList.size();i++)
            {
                fWriter.append(successList.get(i)+"\n");
            }
            log.info("Error List");
            errorList.forEach(System.out::println);
            fWriter.flush();
            fWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
