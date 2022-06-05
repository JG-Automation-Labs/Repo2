import java.util.Scanner;

public class NumberAllDemo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter your number :");
		int no = sc.nextInt();
		System.out.print("\n**********factorial using while loop************\n");
		/*int fact=1;
		while(no>0){
			fact =fact*no;
			no--;	
		}System.out.print(fact);
		*/
		System.out.print("\n**********factorial using for loop************\n");

		 int fact1 =1;
			for(int i=1;i<=no;i++) {
			fact1 = fact1*i;
		}System.out.println(fact1);
		int rev=0;
		int temp= no;
		while(no>0) {
			rev = rev*10+no%10;
			no=no/10;
			
		}System.out.print("\n reverse is :"+rev);
		if(temp==rev)
			System.out.println("\n pallindrome");
		else
			System.out.println("\n not pallindrome");
		
		
		}
}
