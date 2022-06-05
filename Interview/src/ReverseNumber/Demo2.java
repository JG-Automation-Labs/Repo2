package ReverseNumber;

public class Demo2 {

	public static void main(String[] args) {
		int rev=0, no =543;
		while(no>0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.print("reverse is : "+rev);
	}

}
