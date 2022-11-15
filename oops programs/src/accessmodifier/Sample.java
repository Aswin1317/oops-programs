package accessmodifier;

public class Sample {
	
public static void main(String[] args) {
	PublicSample publicsample=new PublicSample();
	System.out.println("Public variable "+publicsample.a);
	//System.out.println("Private variable "+publicsample.b);
	System.out.println("Protected variable "+publicsample.c);
	System.out.println("Default variable "+publicsample.d);
	
}
}
