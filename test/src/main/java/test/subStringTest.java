package test;

public class subStringTest {
	
	public static void main(String[] args) {
		String str = "衛部醫器輸字第028639號";
		String sub[] = str.split("第");
		String subStr = sub[1].replaceAll("號", "");
		String subStr2 = sub[0];
		System.out.println(subStr);
		System.out.println(subStr2);
	}

}
