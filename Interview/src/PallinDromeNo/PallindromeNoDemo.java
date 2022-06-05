package PallinDromeNo;

public class PallindromeNoDemo {

	public static void main(String[] args) {
		int no=374;
		int rev=0,temp,rem=0;
		temp=no;
		while(no>0)
		{
			rev=rev*10+no%10;
			no= no/10;
		}
		if(rev==temp)
			System.out.print("the number is pallindrome");
		else
			System.out.print("number is not pallindrome");
	}

}
