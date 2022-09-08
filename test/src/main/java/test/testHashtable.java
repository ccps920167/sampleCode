package test;

import java.util.Hashtable;
import java.util.Vector;

public class testHashtable {
	
	public static void main(String[] args) {
		//System.out.println("hello World");
		Vector v = new Vector();
		v.addElement("aaa");
		v.addElement("bbb");
		System.out.println(v);
		System.out.println(v.elementAt(1));
		
		for(int i=0 ;i<v.size();i++) {
			System.out.println(v.elementAt(i));
		}
		
//		Hashtable ht=new Hashtable();
//		ht.put("DELIVERY_NO_VBELN","testSS");
//		System.out.println(ht.get("DELIVERY_NO_VBELN"));
	}

}
