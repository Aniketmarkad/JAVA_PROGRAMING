//accept the number as  input from user and count odd digit 

import java.util.*;

class Digit
{
    public int CountOdd(int iNo)
    {
        int iDigit = 0;
        int iCount =0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {  
            iDigit = iNo % 10;
            if( iDigit % 2 != 0)
            {   
               iCount++;
            }
            iNo = iNo /10;

        }
        return iCount;

    }
    
}

public class program51
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.CountOdd(iValue1);

        System.out.println("no of odd digit is :"+iRet);
        
    }
}








