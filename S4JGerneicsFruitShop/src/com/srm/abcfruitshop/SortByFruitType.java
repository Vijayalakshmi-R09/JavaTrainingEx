package com.srm.abcfruitshop;

import java.util.Comparator;

public class SortByFruitType implements Comparator<Fruitdetails>{

	@Override
	public int compare(Fruitdetails o1, Fruitdetails o2) {
	return o1.fruitType.compareTo(o2.fruitType);
	}
}

