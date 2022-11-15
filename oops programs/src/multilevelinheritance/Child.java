package multilevelinheritance;

public class Child extends Parent{
public void display()
{
	System.out.println("Child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child child=new Child();
child.display();
child.sum();
child.name();
	}

}
