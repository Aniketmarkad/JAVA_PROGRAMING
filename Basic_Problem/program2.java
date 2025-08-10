 // Taking input from user and addtion of two number
 
import java.util.Scanner;

public class program2
{
    public static void main (String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value :");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second value : ");
        int iValue2 = sobj.nextInt();
        
        int  iAns  =  iValue1 + iValue2;
        System.out.println("Addition is :"+iAns);

    }
}
