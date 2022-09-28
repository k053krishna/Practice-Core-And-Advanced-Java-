package Com.singleturn.designepattern.demo;

public class SingletonDemo {

	private static SingletonDemo st;
	
	private static SingletonDemo getSingletonDemo() {
		 st=new SingletonDemo();
		return st;
	}
	
	public static void main(String[] args) {
	System.out.println(SingletonDemo.st.getSingletonDemo().hashCode());
	System.out.println(SingletonDemo.st.getSingletonDemo().hashCode());
	System.out.println(SingletonDemo.st.getSingletonDemo().hashCode());
	System.out.println(SingletonDemo.st.getSingletonDemo().hashCode());
	}
}
