package salaryprogram;

public class Total extends HraPf{
int totalslip;
public void slip()
{
	totalslip=basicpay+hra-pf-deduction+bonus;
	System.out.println("Salary Slip");
	System.out.println("Basic Pay :"+basicpay);
	System.out.println("Deduction :"+deduction);
	System.out.println("Hra :"+hra);
	System.out.println("Pf :"+pf);
	System.out.println("Bonus :"+bonus);
	System.out.println("Total Salary :"+totalslip);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Total total=new Total();
total.salary();
total.deduct();
total.slip();
	}

}
