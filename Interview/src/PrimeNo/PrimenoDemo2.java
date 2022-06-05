package PrimeNo;

public class PrimenoDemo2 {
	public static void main(String args[])
	{
		int no =  10;
		int i =1,count=0;
		while(i<=no)
		{
			if(no%i==0)
				count++;
			i++;
		}
		if(count==0)
			System.out.print("No is prime");
		else
			System.out.print("no is not prime");
				}
}
