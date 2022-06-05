package Practice;
class fruit{
	final public void taste() {
		System.out.println("\n this is fruits taste");
	}
}

class apple extends fruit{
	final public void taste(int a) {
		super.taste();
		System.out.println("\n "+a);

	}
	public void shape() {
		System.out.println("\n this is shape of apple");
	}
}

public class Inheritance0 {
		int mobno=985012;
	public static void main(String[] args) {
	apple f1 = new apple();
	f1.taste(20);
	f1.shape();
	Inheritance0 i = new Inheritance0();
	System.out.println("\n"+i.mobno);
	}

}
