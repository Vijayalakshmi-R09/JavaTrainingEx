package com.srm.javatrainingex;

import java.util.logging.Logger;

public class MinMaxDtype {
	static Logger log=Logger.getLogger(MinMaxDtype.class.getName());
	public static void main(String[] args) {
		var dash="---------------------------\\n";
		var max="Max = ";
		var min="Min = ";
		  log.info("\nInteger Datatype  Range");
		  log.info(dash);
		  log.info(min + Integer.MIN_VALUE);
		  log.info(max + Integer.MAX_VALUE);
	
		  log.info("\nFloat Datatype  Range");
		  log.info(dash);
		  log.info(min + Float.MIN_VALUE);
		  log.info(max + Float.MAX_VALUE);
	
		  log.info("\nDouble Datatype  Range");
		  log.info(dash);
		  log.info(min + Double.MIN_VALUE);
		  log.info(max + Double.MAX_VALUE);
	
		  log.info("\nByte Datatype  Range");
		  log.info(dash);
		  log.info(min + Byte.MIN_VALUE);
		  log.info(max + Byte.MAX_VALUE);
	
		  log.info("\nShort Datatype  Range");
		  log.info(dash);
		  log.info(min + Short.MIN_VALUE);
		  log.info(max + Short.MAX_VALUE);
	   }

	}

