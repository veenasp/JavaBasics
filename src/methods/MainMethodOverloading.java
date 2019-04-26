package methods;

public class MainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("Actual main method");
		main("Divya");
		main("Divya","Shree");
	}
	public static void main(String arg1) {
		System.out.println("Overloaded main method1");
	}
	public static void main(String arg1,String arg2) {
		System.out.println("Overloaded main method2");
	}
}
