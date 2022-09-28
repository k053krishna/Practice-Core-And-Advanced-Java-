
public class WapperDemo {
public static void main(String[] args) {
	int a=20;
	
	Integer i =new Integer (a);//autoboxing
	System.out.println("value of i is>>> " +i);
	
	int b=i.intValue();//unboxing
	System.out.println("value of  b is >> " +b);
}
}
