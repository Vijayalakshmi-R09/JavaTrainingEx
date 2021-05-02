package com.srm.javatrainingex;

import java.util.Scanner;

public class FindThreadID extends Thread{

	 public void run()
	    {
	        System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
	        System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
	    }
	    public static void main(String[] args)
	        throws InterruptedException
	    {
	        Scanner s = new Scanner(System.in);
	        FindThreadID t1 = new FindThreadID();
	        FindThreadID t2 = new FindThreadID();
	        t1.start();
	        t2.start();
	        t1.join();
	    }
	}

