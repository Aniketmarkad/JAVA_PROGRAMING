//check wheather no is divisible by 3 or not

import java.util.*;
class Number
{
    boolean CheckDivisible(int ino)
    {
        boolean bflage = false;

        if((ino % 3) == 0 )
        {
            bflage = true;
        }
        else
        {
            bflage =false;
        }

        return bflage;
    }
}

public class program23
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0;
        boolean bRet = false;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckDivisible(ivalue);

        if(bRet == true)
        {
            System.out.println(ivalue+" is divisible by 3 ");
        }
        else
        {
            System.out.println(ivalue+" is not divisible by 3 ");
        }

    }
        
}







