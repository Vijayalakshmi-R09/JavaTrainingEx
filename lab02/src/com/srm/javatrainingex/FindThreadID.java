package com.srm.javatrainingex;


import java.util.logging.Logger;

public class FindThreadID extends Thread{
	static Logger log=Logger.getLogger(FindThreadID.class.getName());
	@Override
	 public void run()
	    {
	        log.info("Current Thread Name: "+ Thread.currentThread().getName());
	        log.info("Current Thread ID: "+ Thread.currentThread().getId());
	    }
	    public static void main(String[] args)
	        throws InterruptedException
	    {
	        
	        var t1 = new FindThreadID();
	        var t2 = new FindThreadID();
	        t1.start();
	        t2.start();
	        t1.join();
	    }
	}

