package org.cap.demo;

public class ProductApp {

	int[] arr = {1,4,23};
	
	public void productDisplay() {
		System.out.println("IGATE");
		System.out.println("Capgemini");
		
		for(int j=0;j<arr.length;j++){
			System.out.println("Date"+arr[j]);
		}
		int sum=0;
		for(int j:arr){
			sum = sum+j;
		}
		System.out.println("Sum" +sum);
	}
		
}
