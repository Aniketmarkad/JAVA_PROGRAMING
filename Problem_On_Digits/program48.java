//accept the number as  input from user and count  digit 

import java.util.*;

class Digit
{
    public int CountDigit(int iNo)
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
            iCount++;
            iNo = iNo /10;

        }
        return iCount;

    }
    
}

public class program48
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.CountDigit(iValue1);

        System.out.println("no of  element is :"+iRet);
        
    }
}








