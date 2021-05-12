package com.example.fileabstract;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileabstractApplication  {

		public static void main(String[] args) throws InCorrectDateOfManufacturerException, HeaderCostNotMatchingException, IOException {
			SpringApplication.run(FileabstractApplication.class, args);
			CarFileHandler cf=new CarFileHandler();
			cf.readFileNames();
			cf.readFileContent();
			cf.writeFileContent();
	}

}
