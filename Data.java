class Data{
    int i=10;
    String name = "Hello";

	
	public Data() {
	    System.out.println("This is a Constructor");
	}
	
	public void display() {
	    System.out.println("This is Method");
	}
}
public class Student {
public static void main (String[] args) {
	Data ref = new Data();
	ref.display();
}
}	
		