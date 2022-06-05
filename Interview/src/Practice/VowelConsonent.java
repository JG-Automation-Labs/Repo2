package Practice;

public class VowelConsonent {

	public static void main(String[] args) {
		VowelConsonent.Consonent('a', 'z');
		VowelConsonent.Vowels('a', 'z');
	}
	public static void Vowels(char starts,char ends) {
		int count=0;
		int ct=0;
	for(char i=starts;i<=ends;i++)
	{
		if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
		{
			System.out.println("\t"+i);
			count++;
		}
		else
			ct++;
		
	}
	System.out.println("\n\tvovwels are :"+count);
	
	}
	public static void Consonent(char starts,char ends) {
		int count=0;
		int ct=0;
	for(int i=starts;i<=ends;i++)
	{
		if(i!=97||i!=101||i!=105||i!=111||i!=117)
		{
			System.out.println("\t"+i);
			count++;
		}
		else
			ct++;
		
	}
	System.out.println("\n\t consonent are :"+count);
	}
}
