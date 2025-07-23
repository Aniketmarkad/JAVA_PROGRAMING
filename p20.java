//check wheather no is even or not

import java.util.*;
class Arithematic
{
    boolean CheckEven(int ino)
    {
        boolean bflage = false;

        if((ino % 2) == 0 )
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

public class p20
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0;
        boolean bRet = false;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        bRet = aobj.CheckEven(ivalue);

        if(bRet == true)
        {
            System.out.println(ivalue+" is Even no ");
        }
        else
        {
            System.out.println(ivalue+" is not  Even  no ");
        }

    }
        
}






