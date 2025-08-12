//accept the number as  input from user and count frequency of  digit 5 

import java.util.*;

class Digit
{
    public int CountFrequency(int iNo)
    {
        int iCount = 0,iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {  
            iDigit = iNo % 10;
            if( iDigit == 5)
            {
                iCount++;
            }
            iNo = iNo /10;

        }
        return iCount;
    }
    
}

public class program53
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.CountFrequency(iValue1);
        System.out.println("Frequency of 5 is  : "+iRet);
    }
}





