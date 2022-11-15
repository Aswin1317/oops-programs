package heirarchialinheritance;

public class ClassC extends ClassA{
public void name()
{
	System.out.println("C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassC classc=new ClassC();
classc.name();//overriding
//classc.name();
	}

}
