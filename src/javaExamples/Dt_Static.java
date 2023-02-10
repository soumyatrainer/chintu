package javaExamples;

public class Dt_Static {
	int b=30;  //instance var
	static int empid = 101;
	//Non-static methods
	public void m1() {
	//  DT Var VV --- To Represent Data
	    int a=10; //local var
	System.out.println("M1 Executed");
//	               int   string
	System.out.println(a + " Localvar"); // 10
	System.out.println(empid + " static var");
	}
	public void m2() {
		System.out.println("M2 Executed");
		System.out.println(b + " instance var");
		System.out.println(empid+ " static var");
		}
		public void m3() {
		System.out.println("M3 Executed");
		System.out.println(b+" instance var");
		}
		//static method
		public static void st() {
			System.out.println("static method executed");    
			}
			public static void main(String args[]) {
			System.out.println("main method executed");
			//Non-static : access by using object
			Hello1    m = new Hello1();
			    m.m1();
			    m.m2();
			    m.m3();
			//Static : access by using classname
			   
			}
			}