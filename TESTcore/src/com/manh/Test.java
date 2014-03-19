/**
 * 
 */
package com.manh;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * @author mbeniwal
 * Mar 14, 2014
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, Integer> hsh = new Hashtable<String, Integer>();
		hsh.put("hello", 0);
		Integer val = hsh.get("hello");
		System.out.println(val.intValue());
		/*List<String> strlist = new ArrayList<String>();
	    strlist.add("sdfs1");
	    strlist.add("sdfs2");

	    String[] strarray = new String[strlist.size()];
	    strlist.toArray(strarray );

	    System.out.println(strarray);*/

	}

}
