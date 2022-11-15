package finalprogram;

public final class Example {
final int a=10;//final variable
public void display()
{
	 
	 System.out.println(a);
}
public final void name() {
	System.out.println(a);
}
public static void main(String[] args) {
	Example example=new Example();
	example.display();
}
}
