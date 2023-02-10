package javaExamples;

public class DT_Var {
	int b=20; // instance variable
		static int empid = 101; //static variables
			public void m1() {
		int a =10; //local variables
			System.out.println("M1 Executed");
		System.out.println("Local variable" +a);
	
	}
	public void m2() {
		System.out.println("M2 Executed");
		System.out.println("instance variable" +b);
		System.out.println("static varible"+ empid);
	}
	public void m3() {
		System.out.println("M3 Executed");
		System.out.println("instance variable" +b);
		System.out.println("static varible"+ empid);
	}
	public static void st() {
		System.out.println("static method executed");
	}
	public static void main(String args[]) {
		System.out.println("main method executed");
		DT_Var m = new DT_Var ();
		m.m1();// Accessing method by using object
		m.m3();
		m.m2();
	}
}
