package ReverseNumber;

public class ReverseNumber1 {

	public static void main(String[] args) {
			long no = 98765, reverse= 0;
			long rem;
			while(no!=0)
			{
				rem = no % 10;
				reverse = reverse * 10 +rem;
				no = no/10;
			}
			System.out.println("reverse of no is : "+reverse);
	}

}
