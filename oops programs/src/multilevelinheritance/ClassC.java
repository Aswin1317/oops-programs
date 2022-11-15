package multilevelinheritance;

public class ClassC extends ClassB {
	public void abc()
	{
		System.out.print("C");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC classc=new ClassC();
		classc.abc();
		classc.name();//overriding
		classc.sum();
	}

}
