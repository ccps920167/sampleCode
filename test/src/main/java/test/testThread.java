package test;



public class testThread implements Runnable{
	
	public void run() {
		int h = 0;
        for (int i=0; i<5; i++){
        	try {
				Thread.sleep(1000);
				h++;
				System.out.println(h);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
	
}

