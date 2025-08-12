//accept the number as  input from user and return its Summation of digit

import java.util.*;

class Digit
{
    public int Summation(int iNo)
    {
        int iDigit = 0;
        int iSum =0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {  
            iDigit = iNo % 10;  
            iSum = iSum + iDigit;
            iNo = iNo /10;

        }
        return iSum;

    }
    
}

public class program52
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.Summation(iValue1);

        System.out.println("Summation of digit is  :"+iRet);
        
    }
}









