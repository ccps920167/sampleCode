package test;

public class testTimeFormat {
	
	public static void main(String[] args) {
		
		String startTime = "0630";
		String min = startTime.substring(2);
		String hour = startTime.substring(0,2);
		float allSecond = Integer.valueOf(hour)*3600+Integer.valueOf(min)*60 ;
		float turnHour = allSecond/3600;
		
		System.out.println("min="+min);
		System.out.println("hour="+hour);
		System.out.println("allSecond="+allSecond);
		System.out.println("turnHour="+turnHour);
		testTimeFormat tf = new testTimeFormat();
		String getHours1 = tf.getHours(startTime);
		System.out.println("getHours1="+getHours1);
	}
	
	public String getHours(String str) {
		String min = str.substring(2);
		String hour = str.substring(0,2);
		int allSecond = Integer.valueOf(hour)*3600+Integer.valueOf(min)*60 ;
		String turnHour = Integer.toString(allSecond/3600);
		
		
	return turnHour;
	}

}
