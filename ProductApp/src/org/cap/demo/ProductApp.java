package org.cap.demo;

public class ProductApp {

	int[] arr = {1,4,23};
	
	public void productDisplay() {
		System.out.println("IGATE");
		System.out.println("Capgemini");
		System.out.println("Dev2");
		
		for(int j2=0;j2<arr.length;j2++){
			System.out.println("Date"+arr[j2]);
		}
		int sum=0;
		for(int j:arr){
			sum = sum+j;
		}
		System.out.println("Sum" +sum);
	}
		
}
