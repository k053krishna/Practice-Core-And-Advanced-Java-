package com.assighment16;

public class Product {
    
	void productCheck(int weight) {
		if(weight<100) {
	    throw new ProductException("incorrect weight...weight should be above 100");
	    }else {
	    	System.out.println("weight of Product>>>" +weight);
	    }
	}
}
