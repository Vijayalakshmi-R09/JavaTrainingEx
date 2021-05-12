package com.example.fileabstract;

public class InCorrectDateOfManufacturerException extends Exception{

    public InCorrectDateOfManufacturerException(String date) {
        super(date);
    }

}
