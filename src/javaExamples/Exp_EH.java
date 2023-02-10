package javaExamples;

public class Exp_EH {
	public static void main(String args[]) {
	    try {
	    int a=10/0;
	    System.out.println(a);
	    }
	    catch(Exception e) {
	    System.out.println(e);    
	    }

	    try {
	        int a[]= {10,20,30,40,50,60};
	        System.out.println(a[2]);
	        }
	        catch(Exception e) {
	        System.out.println(e);    
	        }
	    }
	    }