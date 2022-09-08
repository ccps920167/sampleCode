package test;

public class testSleep {
	public static void main(String[] args) {
		
//		int num = 0;
		
		for(int i = 0 ;i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
		}

	}
}
