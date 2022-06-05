package PrimeNo;

public class PrimeDemo2 {

	public static void main(String[] args) {
	int i=1,count=0,no=5;
		while(i<=no)
		{
			if(no%i==0)
				count++;
			i++;
		}
		if(count==2)
			System.out.print("number is prime");
		else
			System.out.print("number is not prime");
	}
}