package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regTest {
	public static void main(String[] args) {
		String reg = "[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*()——+|{}【】‘；：”“’。， 、？]";
		Pattern p = Pattern.compile(reg);
		String org = "\"1 Queen's Rd. East, East HK\"";
		Matcher m = p.matcher(org);
		String newString = m.replaceAll(" ").trim();
		String newString2 = org.replaceAll(reg," ").trim();
		
		System.out.println(newString);
		System.out.println(newString2);
		
	}

}
