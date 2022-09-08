package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class arrayTEST {
//	String arr[][] = new String[2][2];
	
	public static void main(String[] args) {
		String arr[][] = {{"1","2"},{"3","4"}};
		String arr2[] = {"1","2"};
		
		List<String> list = new ArrayList<String>();
		List<String[]> arrlist = new ArrayList<String[]>();
		
		Vector v = new Vector();
		Vector v2 = new Vector();
		
		list.add("a");
		list.add("b");
		
		arrlist.add(arr2);
		
		v.add("c");
		v.add("d");
		
		v2.addElement(arr2);
		
		//String vToA2D[][] = new String[2][0];
//		listtoA = (String[][])list.toArray(new String[0][0]);
		String listToArr[] = list.toArray(new String[0]);
		String listToArr2D[][] = (String[][])arrlist.toArray(new String[0][0]);
		
		String vToArr[] = (String[])v.toArray(new String[0]);
		String v2ToA2D[][] = (String[][])v2.toArray(new String[0][0]);
		//String vToA2D[][] = (String[][])v.toArray(new String[0][0]);
//		for(String[] str:listtoA) {
//			for(String str2:str) {
//				System.out.print(str2+" ");
//			}
//		}
		System.out.println("===list to Arr===");
		for(String str2:listToArr) {
			System.out.print(str2+" ");
		}
		System.out.println("\n"+"===list to Arr2D===");
		for(String[] str:listToArr2D) {
			for(String str2:str) {
				System.out.print(str2+" ");
			}
		}
		
		System.out.println("\n"+"===vector to Arr===");
		for(String str2:vToArr) {
			System.out.print(str2+" ");
		}
		System.out.println("\n"+"===vector to Arr2D===");
		for(String[] str:v2ToA2D) {
			for(String str2:str) {
				System.out.print(str2+" ");
			}
		}
	}

}
