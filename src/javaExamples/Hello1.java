package javaExamples;

public class Hello1 {
public void m1() {
	System.out.println("M1 Executed");
}
public void m2() {
	System.out.println("M2 Executed");
}
public void m3() {
	System.out.println("M3 Executed");
}
public static void main(String args[]) {
	System.out.println("main method Executed");
//classname objectname =new classname();
	Hello1    m = new Hello1();
	m.m1();
	m.m3();
	m.m2();
}

}
