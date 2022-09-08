package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class arrayTEST2 {
//	String arr[][] = new String[2][2];
	
	public static void main(String[] args) {
		String arr[][] = {{"1","2"},{"3","4"}};
		String arr3[][] = {{"1"},{"4"}};
		String arr2[] = {"1","2"};
		
		String str1 = "產品編號1";
		String str2 = "規格1";
		String str3 = "產品編號2";
		String str4 = "規格2";
		
		String [][]arr4 = {{str1,str2},{str3,str4}};
		
		
		System.out.println("\n\n"+"===2維陣列全部(forEach)===");
		for(String[] str:arr4) {
			for(String str5:str) {
				System.out.print(str5+" ");
			}
		}
		
		System.out.println("\n\n"+"===2維陣列全部(迴圈)===");
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[0].length;j++) {
				System.out.print(arr4[i][j]);
			}
		}
		System.out.println("\n\n"+"===2維陣列索引===");
		System.out.print(arr4[0][0]);
		
	}

}
