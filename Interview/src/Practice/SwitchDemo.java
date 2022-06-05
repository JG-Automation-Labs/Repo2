package Practice;

public class SwitchDemo {
	public static void main(String[] args) {
		char ch ='/';
		int num1=50,num2=10;
		SwitchDemo c=new SwitchDemo();
		checkVowels('*', 50, 4);
		System.out.println(CheckVowels1('a','k'));
	}
	public static int CheckVowels1(char starts,char ends) {
		int count=0;
		for(int ch =starts;ch<=ends;ch++) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			count++;
		}
		}return count;
	}

		public static void checkVowels(char ch,int num1,int num2){
			int res=0;
		switch(ch)
		{
		case '+':
			res = num1+num2;
			System.out.println(res);
			break;
		case '/':
			res = num1/num2;
			System.out.println(res);
			break;
		case '*':
			res = num1*num2;
			System.out.println(res);
			break;
		case '-':
			res = num1-num2;
			System.out.println(res);
			break;
		default:
			System.out.print("\n invalid input or input mismatched");
			break;
		}
		}
		}