package test;

public class StringBufferTest {
	public static void main(String[] args) {
		String a = "AA";
		String b = "BB";
		String c = "CC";
//		String STR = "<a></a>";
		String []column = {a,b,c};
		StringBuilder sb = new StringBuilder();
		for(String str:column) {
			String STR = "<a>"+str+"</a>";
			
			sb.append(STR);
		}
		
		System.out.println(sb);
	}

}
