package test;

import java.util.Hashtable;
import java.util.Vector;

public class testHashtable2 {
	
	public static void main(String[] args) {
		
		Vector param=new Vector();
		Hashtable ht=new Hashtable();
		param.addElement(ht);
		ht.put("A","A-Value");
		
		System.out.println(param);
		
	}

}
