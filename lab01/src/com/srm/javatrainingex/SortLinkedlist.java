package com.srm.javatrainingex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Logger;

public class SortLinkedlist {
	static Logger log=Logger.getLogger( SortLinkedlist.class.getName());

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Berry");
		list.add("Dates");
		list.add("CustardApple");
		log.info("The Original linked list:\n"+list);
		Collections.sort(list);
		log.info("The Sorted linked list:\n"+list);
	}

}
