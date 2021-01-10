package Same;
import java.util.*;
public class Test 
{
			public static void main(String[] ar)
			{
				Scanner sc=new Scanner(System.in);
				//Conversion of C to F
				System.out.print("Value in C:");
				//type casting int the initialization of value
				double a=sc.nextInt();
				double b=((9*a)/5)+32;
				System.out.println("Value in F:"+b);
				//Type casting method 2
				float d=10.4f;
				int c=(int)d;
				System.out.println("Type casting float to int:"+c);
			}

	}
