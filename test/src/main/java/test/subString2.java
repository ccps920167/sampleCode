package test;

public class subString2 {
public static void main(String[] args) {
	
	String num = "1.000";
	String num4 = "0";
	String num2[] = num.split("\\.");
	String num5[] = num4.split("\\.");
	String num3 = num2[0];
//	System.out.println(num2.length);
	System.out.println(num5[0]);
}
}
