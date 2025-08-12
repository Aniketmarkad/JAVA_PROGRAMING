//accept the number as  input from user and count even digit 

import java.util.*;

class Digit
{
    public int CountEven(int iNo)
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
            if( iDigit % 2 == 0)
            {   
               iCount++;
            }
            iNo = iNo /10;

        }
        return iCount;

    }
    
}

public class program50
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.CountEven(iValue1);

        System.out.println("no of even element is :"+iRet);
        
    }
}







