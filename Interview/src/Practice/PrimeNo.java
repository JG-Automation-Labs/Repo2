package Practice;

public class PrimeNo {

	public static void main(String[] args) {
		int count=0;
			int no=5;
			for(int i=1;i<=no;i++)	{
					if(no%i==0)
					count++;
				}
			
			if(count==2)
				System.out.println("no is prime");
			else
				System.out.println("no is not prime");
	}
	VariableDemo v1= new VariableDemo();
	//System.out.println("\n mob no: "+s);


}
