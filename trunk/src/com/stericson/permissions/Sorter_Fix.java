package com.stericson.permissions;

import java.util.Comparator;

public class Sorter_Fix implements Comparator<Permissions_Fix>{

	@Override
	public int compare(Permissions_Fix arg0, Permissions_Fix arg1) {
		return arg0.appName.compareToIgnoreCase(arg1.appName);
	}

}
