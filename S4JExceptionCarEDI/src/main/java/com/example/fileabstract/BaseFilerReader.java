package com.example.fileabstract;

import java.io.IOException;

public abstract class BaseFilerReader {
    String location="E:\\Vijayalakshmi I0025\\JAVA TRAINING\\S4JExceptionCarEDI\\ar_Manufacturer_Files";
    public abstract void readFileNames();
    public abstract void readFileContent() throws InCorrectDateOfManufacturerException, HeaderCostNotMatchingException, IOException;
    public abstract void writeFileContent();
}
