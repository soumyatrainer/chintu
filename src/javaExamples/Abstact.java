package javaExamples;


	abstract class Bank{
		abstract void debit();
		abstract void credit();
		}
		class Hdfc extends Bank{
		public void debit() {
		    System.out.println("HDFC debit");
		}
		public void credit() {
		    System.out.println("HDFC Credit");
		}
		}
		class Icici extends Bank{
		public void debit() {
		    System.out.println("ICICI debit");
		}
		public void credit() {
		    System.out.println("ICICI Credit");
		}
		}
		 class TestBank {
		public static void main(String args[]) {
		    Hdfc hd = new Hdfc();
		    hd.credit();
		    hd.debit();
		    Icici ic = new Icici();
		    ic.credit();
		    ic.debit();
		}
		}
