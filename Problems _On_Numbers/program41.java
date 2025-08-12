// Accept input from user and check it is perfect or not using Flage

import java.util.Scanner;

class Number
{
    boolean CheckPerfect(int iNo)
    {
        int iCnt = 0,iSum = 0;
        boolean bfalge = false;

        for(iCnt = 1;iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0 )
            {
                iSum = iSum + iCnt;
            }
        }

        if(iNo == iSum)
        {
            bfalge = true;
        }
        else
        {
            bfalge = false;
        }

        return bfalge;
    }

}

public class program41
{
    public static void main (String a[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println("number is Perfect ");
        }
        else
        {
            System.out.println("number is not Perfect");
        }
    }    
}

