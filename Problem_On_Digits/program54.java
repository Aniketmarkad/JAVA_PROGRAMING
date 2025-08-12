//accept the number as  input from user and revers the number 

import java.util.*;

class Digit
{
    public int Reverse(int iNo)
    {
        int iDigit = 0;
        int iRev =0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {  
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo /10;

        }
        return iRev;

    }
    
}

public class program54
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        iRet = dobj.Reverse(iValue1);

        System.out.println("updated reverse no is  :"+iRet);
        
    }
}








