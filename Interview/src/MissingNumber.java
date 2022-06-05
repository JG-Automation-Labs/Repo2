
public class MissingNumber {
	public static void main(String []args) {
		int sum=0;
		int sum2=0;
		int arr[] = {1,2,3,4,5,6,7,9,10};
		for(int i=0;i<=10;i++) {
			sum = sum +i;
		}System.out.print("\n "+sum);
		
		for(int i=0;i<arr.length;i++) {
			sum2= sum2 +arr[i];
		}
		System.out.print("\n " +sum2);
		
		int missNo = sum-sum2;
		System.out.print("\n missing no is : "+missNo);
		
	}
}
