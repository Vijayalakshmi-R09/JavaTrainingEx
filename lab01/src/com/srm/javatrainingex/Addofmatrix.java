package com.srm.javatrainingex;


import java.util.Scanner;
import java.util.logging.Logger;

public class Addofmatrix {
	static Logger log=Logger.getLogger(Addofmatrix.class.getName());

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        log.info("Matrix 1\nEnter the number of rows: ");
        var r = sc.nextInt();
        log.info("Enter the number columns: ");
        var c = sc.nextInt();
        int[][] m1 = new int[r][c];
        log.info("Enter the elements of the matrix");
        for(var i = 0; i < r; i++)
        {
            for(var j = 0; j < c; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }
        log.info("Matrix 2\nEnter the number of rows: ");
        var r1 = sc.nextInt();
        log.info("Enter the number columns: ");
        var c1 = sc.nextInt();
        int[][] m2 = new int[r1][c1];
        log.info("Enter the elements of the matrix");
        for(var i = 0; i < r; i++)
        {
            for(var j = 0; j < c; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }

        log.info("Elements of the Matrix 1 :");
        for (var i = 0; i < r; i++) 
        {
            for (var j = 0; j < c; j++)
            {
            	log.info(m1[i][j] + "  ");
            }
            log.info("");
        }
        log.info("Elements of the Matrix 2 :");
        for (var i = 0; i < r1; i++) 
        {
            for (var j = 0; j < c1; j++)
            {
            	log.info(m2[i][j] + "  ");
            }
            log.info("");
        }
        int[][] m3=new int[r][c];     
        for(var i=0;i<r;i++)
        {    
        	for(var j=0;j<c;j++)
        	{    
        		m3[i][j]=m1[i][j]+m2[i][j];    
        		log.info(m3[i][j]+" ");    
        	}    
        	log.info("");
        }
	}
}
