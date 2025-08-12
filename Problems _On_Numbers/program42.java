// Accept input from user and check it is prime or not 

import java.util.Scanner;

class Number
{
    boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(iCnt = 2;iCnt <= iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0 )
            {
                break;
            }
        }
        
        if(iCnt > iNo/2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

public class program42
{
    public static void main (String a[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("number is Prime ");
        }
        else
        {
            System.out.println("number is not Prime");
        }
    }    
}
