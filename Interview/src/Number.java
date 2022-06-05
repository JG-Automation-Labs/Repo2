
public class Number {

	public static void main(String[] args) {
		int arr[]= {2,15,89,3,6,9};
			Number.minno(arr);
				Number.maxno(arr);
		}
	static void minno(int arr[]) {
		int min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}			System.out.print("\n minimum number is : "+min);

	
	}
	static void maxno(int arr[]) {
		int max= arr[0];
		for (int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			//System.out.println("\n maximum :"+max);
		}			System.out.println("\n maximum :"+max);

		
	}

}
