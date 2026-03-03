class Data{
    int i=10;
    String name = "Hello";

	
	public Data(int x, String s) {
	    System.out.println("This is a Constructor");
		System.out.println(x+ " " +s);
	}
	
	public void display() {
	    System.out.println("This is Method");
		System.out.println("Integer "+i);
	}
}
public class Student {
public static void main (String[] args) {
	Data ref = new Data(5,"hehe");
	ref.display();
}
}	
		