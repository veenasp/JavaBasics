package methods;

class Calculator1 {
	public static void add() {
		int res=0;
		System.out.println("res of add()= "+res);
		return;
	}
	public void add(int a, int b) {
		int res=a+b;
		System.out.println("res of add(int a, int b)= "+res);
		
	}
	public static double add(int a, double b) {
		double res=a+b;
		System.out.println("res of add(int a, double b)= "+res);
		return res;
	}

}
public class Calculator {

	public static void main(String[] args) {
		Calculator1.add();
		Calculator1 ref=new Calculator1();
		ref.add(10,13);
	}

}
