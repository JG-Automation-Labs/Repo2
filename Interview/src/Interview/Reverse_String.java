package Interview;

public class Reverse_String {
	public static void main(String []args) {
		System.out.print(reverseString("Java_point"));
		String str = "I am from maharashtra";String temp = "";
		for(int i =0;i<str.length();i++) {
			temp=temp+" "+str.charAt(i);
		}System.out.println(temp);
		System.out.println("\n**********************************\n");

		String temp1[] = str.split(" ");
		for(String s : temp1) {
			System.out.print(s);
		}
		System.out.println("\n**********************************\n");
		String no = " ";
		for (int i =temp1.length-1;i>=0;i--) {
				no = no+" "+temp1[i];
		}System.out.println(no);
	}
	static String reverseString(String s) {
		if(s.isEmpty()||s.length()<1) {
			return s;
		}
		else
		{
			return reverseString(s.substring(1))+s.charAt(0);
		}
	}
}
