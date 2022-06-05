package Practice;

import java.util.Scanner;

public class SwitchDemo2 {
	
	public static void main(String[] args) {
	//	int num1 , num2;
		//char ch;
		SwitchDemo2.Calculator('/',15,2);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter case :");
		char ch = sc.next().charAt(0);

		SwitchDemo2.Calculator(ch,15,2);
		sc.close();
		
	//	Vowels('a','z');
		
	}
	
	public static void Calculator(char ch,int num1,int num2)
	{
		int res =0;
		switch(ch) {
		case '+':
			res= num1+num2;
			System.out.println("\n addition is :"+res);
			break;
			
		case '-':
			res= num1-num2;
			System.out.println("\n addition is :"+res);
			break;
		
		case '/':
			res= num1/num2;
			System.out.println("\n addition is :"+res);
			break;
		
		case '*':
			res= num1*num2;
			System.out.println("\n addition is :"+res);
			break;
			
		default:
			System.out.print("invalid input");
			break;
		}
	}

}
