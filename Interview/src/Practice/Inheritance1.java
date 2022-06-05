package Practice;
  class parent{
	 final void show() {
		  System.out.println("\nthis is show function of parent class");
	  }
	}
class child1 extends parent{
	child1(){
	}
	
 public void display() {
		System.out.println("\n thus is child class");
	}
}

final class Inheritance1 {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.show();
		c1.display();
		
	}

}
