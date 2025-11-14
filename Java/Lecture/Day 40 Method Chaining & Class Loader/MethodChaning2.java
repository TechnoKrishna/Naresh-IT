import java.util.Scanner;

public class MethodChaning2 {
public static void main(String[] args)
{
String s1 = "India is great"; 
int length = s1.toUpperCase().length(); 
System.out.println("Length is: "+length);

System.out.println(".........................");

Scanner sc = new Scanner(System.in);
System.out.print("Enter a character: ");
char ch = sc.next().charAt(0);
System.out.println(ch);

System.out.println(".........................");

int []arr = {10,20,30}; //[I

String name = arr.getClass().getName(); 
System.out.println(name);

sc.close();
}
}

