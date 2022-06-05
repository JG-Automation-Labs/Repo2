package PrimeNo;

import java.util.Scanner;

public class PrimeNoDemo {

	public static void main(String[] args) {
		int i=1,count = 0;
	//	Scanner sc = new Scanner(System.in);
		//System.out.print("Enter your no: ");
		int no = 8; //sc.nextInt();
		while(i<=no)
		{
			if(no%i==0)
				count++;
			i++;
		}
		 if(count==2) {
			System.out.print("Entered no is prime");
		}
		 else
			 System.out.print("no is not prime");

		}

}
