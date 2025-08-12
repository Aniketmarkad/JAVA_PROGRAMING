// take input from user return its factorial

import java.util.*;
class Number
{
    int Factorial(int ino)
    {
        int icnt = 0;
        int iFact = 1;

        for(icnt = 1; icnt <= ino; icnt++) 
        {
            iFact = iFact * icnt;
        }

        return iFact;
    
    }
}

public class program27
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0,iRet = 0;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Factorial(ivalue);

        System.out.println("Factorial is :"+iRet);
    }
}





