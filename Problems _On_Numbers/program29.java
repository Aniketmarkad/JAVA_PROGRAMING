// take input from user return its factorial also using final and  while in it

import java.util.*;
class Number
{
    int Factorial(int iNo)
    {
        int icnt = 0;
        int iFact = 1;

        if( iNo < 0)
        {
            return program29.ERR_UNVALID;
        }

        icnt = 1;
        while( icnt <= iNo) 
        {
            iFact = iFact * icnt;
            icnt++;
        }

        return iFact;
    
    }
}

public class program29
{
    public static final int ERR_UNVALID = -1;
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0,iRet = 0;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Factorial(ivalue);

        if(iRet == ERR_UNVALID)
        {
            System.out.println("Invalid  input unable to find factorial");
        }
        else
        {
            System.out.println("Factorial is :"+iRet);
        }
        
    }
}






