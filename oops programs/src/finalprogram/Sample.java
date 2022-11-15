package finalprogram;

public class Sample extends Example{ //final class cannot be extended
public void name()
{
System.out.println("Abc");	
}
public static void main(String[] args) {
	Sample sample=new Sample();
	sample.name();
}
}
