package javaExamples;

public class OverRide {
	public void add(int a,int b) {
        System.out.println(a-b);
        System.out.println("New Feat:");
    }
public static void main(String args[]) {
    OverRide obj = new OverRide();
    obj.add(10, 20);
}
}