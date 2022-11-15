package salaryprogram;

public class HraPf extends Salary {
int hra;
int pf;
public void deduct()
{
	int s=100-5;
	hra=(s*basicpay)/100;
	int t=100-20;
	pf=(t*basicpay)/100;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
HraPf hrapf=new HraPf();
hrapf.salary();
hrapf.deduct();
	}

}
