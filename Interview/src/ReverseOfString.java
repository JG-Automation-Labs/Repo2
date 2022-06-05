
public class ReverseOfString {
	public static void main(String []args) {
		String s1= "I love India";
		System.out.println("\n**********print given string**********\n");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n**********print given string using spaces**********\n");

		for(int i=0;i<s1.length();i++) {
			System.out.print(" "+s1.charAt(i));
		}
		
		System.out.println("\n************print reverse string**************\n");
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(" "+s1.charAt(i));
		}
		System.out.println("\n************remove spaces between string**************\n");
		String str[]= s1.split(" ");
		for(String s:str) {
			System.out.print(s);
		}
		System.out.println("\n************reverse words of string**************\n");
		String temp= "";
		for(int i=str.length-1;i>=0;i--) {
				temp = temp+" "+str[i];
		}		System.out.println(temp);
		System.out.println("\n************check pallindrome string**************\n");
		String s2= "abcba";
		String s3= "maharashtra";
		String tempstr1=s2;
		String tempStr2=s3;
		ReverseOfString x=new ReverseOfString();
		x.reverseString(s2);
		x.CheckPallindrome(tempstr1, s2);

		System.out.println("\n*******************\n");
		

	}public void reverseString(String s) {
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	public void CheckPallindrome(String temp,String s) {
		if(temp.equals(s))
			System.out.println("\nstring is pallindrome");
		else
			System.out.println("\n not pallindrome");
	}
}
