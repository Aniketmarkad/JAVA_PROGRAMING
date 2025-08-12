//accept the number as  input from user and display  digit 

import java.util.*;

class Digit
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {  
            iDigit = iNo % 10;
            System.out.println(" digit are :");
            System.out.println(iDigit);
        
            iNo = iNo /10;

        }

    }
    
}

public class program45
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Digit dobj = new Digit();

        dobj.DisplayDigit(iValue1);
        
    }
}






