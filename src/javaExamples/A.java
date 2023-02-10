package javaExamples;

 class A {
	int a=10;
	int b=20;
	public void m1() {
	System.out.println("m1 executed");
	}
	}
	 class B extends A{
	int x=30;
	int y=40;
	public void m2() {
	System.out.println("m2 executed");
	System.out.println(a+b);
	}
	}
	 class C extends B{
	public void m3() {
		System.out.println("m3 executed");
		System.out.println(x+y); //class B
		System.out.println(a+b); //class A
		}
		public static void main(String args[]) {
		    C obj = new C();
		    obj.m1();
		    obj.m2();
		    obj.m3();
		   
		}
		}