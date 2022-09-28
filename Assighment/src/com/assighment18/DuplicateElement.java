package com.assighment18;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]= {10,20,30,10,30,50,60};
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					status= true;
					System.out.println("Duplicate number is " +a[i]);
				}
			}
		}
		if(status==false) {
			System.out.println("dublicate element not found");
		}
	}
}
