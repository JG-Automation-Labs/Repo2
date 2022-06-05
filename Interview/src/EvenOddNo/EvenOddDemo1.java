package EvenOddNo;

import java.util.Scanner;

public class EvenOddDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no%2==0)
		{
			System.out.print("Your no is "+no+" and it is even no ");
		}
		else
		{
			System.out.print("Your no is "+no+" and it is odd number");
		}
		sc.close();
	}

}
