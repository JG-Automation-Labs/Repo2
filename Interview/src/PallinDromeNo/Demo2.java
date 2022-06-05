package PallinDromeNo;

public class Demo2 {

	public static void main(String[] args) {
		int rev=0,no=273,temp;
		temp=no;
		while(no>0)
		{
			rev= rev*10+no%10;
			no=no/10;
		}
		if(rev==temp)
		{
			System.out.print("number is pallindrome");
			
		}
		else
			System.out.print("not pallindrome");
		
	}

}
