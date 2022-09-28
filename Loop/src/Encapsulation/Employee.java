package Encapsulation;

public class Employee {

	private int sallery;

	public void setSallery(int sal) {
		if (sal > 0) {
			sallery = sal;
		} else {
			sallery = 0;
		}
	}
//Degine a method getSallery 
//which return Sallery to that mathod

	public int getSallery() {
		return sallery;
	}
}
