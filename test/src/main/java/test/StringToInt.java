package test;

public class StringToInt {
public static void main(String[] args) {
	String str = "1.000";
//	String str2 = str.replace(".", "");
	int num = Integer.parseInt(str.replace(".", ""));
	
//	System.out.println(str2);
	System.out.println(num);
}
}
