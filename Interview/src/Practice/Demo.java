package Practice;
public class Demo{
	
int roll;
double salary;
static final int no;
 static{
	no = 200;
	//System.out.println("\n"+no);
}
Demo(int roll ,double salary){
	this.roll=roll;
	this.salary=salary;
	//System.out.println("\n "+no);
}
void display() {
	System.out.println(roll + " " + salary);
}
public static void main(String args[]) {
	
	/*Demo c1 = new Demo(101,250045.45);
	c1.display();
	Demo c2 = new Demo(201,550045.45);		
	c2.display();*/
	
}
}