package Assighment4;

public class Fabonaci {
public static void main(String[] args) {
	int value1=0;
	int value2=1;
	for(int i=1;i<=8;i++) {
		System.out.println(value1);
		int temp=value1;
		value1=value1+value2;
		value2=temp;
	}
}
}
