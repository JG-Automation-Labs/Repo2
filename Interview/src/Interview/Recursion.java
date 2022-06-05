package Interview;
//Reverse a string using recursion

public class Recursion   
{  
public static void main(String[] args)   
{  
System.out.print(reverseString("Java_point"));
System.out.print(reverseString("java is programin language"));
System.out.print(reverseString("object oriented"));


}  
static String reverseString(String str)  
{     
if(str.isEmpty())  
{  
      
return str;  
}   
else   
{  
return reverseString(str.substring(1))+str.charAt(0);  
}  
}  

}  