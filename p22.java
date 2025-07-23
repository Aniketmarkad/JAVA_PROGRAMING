//check wheather no is divisible by 3 & 5 or not

import java.util.*;
class Arithematic
{
    boolean CheckDivisible(int ino)
    {
        boolean bflage = false;

        if(((ino % 3) == 0 ) && ((ino % 5) == 0))
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

public class p22
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0;
        boolean bRet = false;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        bRet = aobj.CheckDivisible(ivalue);

        if(bRet == true)
        {
            System.out.println(ivalue+" is divisible by 3 & 5");
        }
        else
        {
            System.out.println(ivalue+" is not divisible by 3 & 5");
        }

    }
        
}








