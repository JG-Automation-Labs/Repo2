
public class String0 {
	public static void main(String []args) {
		String s1 = "I am jayashri";
		String temp= "";
		int cnt=0;

		for(int i=0;i<s1.length();i++)
		{	
			System.out.print(" "+s1.charAt(i));
			cnt++;
		}System.out.println("number of count :"+cnt);
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			temp=temp+s1.charAt(i);
		}			System.out.println(" "+temp);
		System.out.println(" "+s1);
		if(temp.equals(s1))
			System.out.println("String is pallindrome");
		else
			System.out.println("string is not pallindrome");
		String s3= "I am from maharashtra";
		String str[]=s3.split(" ");
		for(String s:str) {
			System.out.print(s);
		}
		String temp1="";
		for(int i=str.length-1;i>=0;i--) {
			temp1=temp1+" "+str[i];
		}			System.out.print(" \n"+temp1);
		String temp3="";
		String str2[]= s1.split(" ");
		for(int i=str2.length-1;i>=0;i--) {
			temp3 = temp3+" "+str2[i];
		}System.out.print("\n "+temp3);
	}
}
