package test;

import java.util.Arrays;

public class array2DTest {
	
	public static void main(String[] args) {
		String arr[][] = {{"1","2"},{"3","4"}};
		String arr2[][] = {{"1"},{"2"},{"3"}};
//		System.out.println(Arrays.toString(arr));
		//System.out.println(arr.length);
//		System.out.println(arr[0][1]);
//		System.out.println(arr2[0][1]);
		for (int j = 0; j < arr2.length; j++) {
			for (int k = 0; k < arr2[0].length; k++) {
				String MEDICALDEVICE = arr2[j][k];
				System.out.println(MEDICALDEVICE);

			}
		}

	}

	

}
