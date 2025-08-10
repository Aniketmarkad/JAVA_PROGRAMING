// take input from user return summation using itreation 1 + 2 + 3 + 4 + 5 + 6 + 7 = 

import java.util.*;
class Number
{
    int Summation(int ino)
    {
        int iSum = 0;
        int icnt = 0;

        for(icnt = 1; icnt <= ino; icnt++) 
        {
            iSum = iSum + icnt;
        }

        return iSum;
    
    }
}

public class program19
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0,iRet = 0;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Summation(ivalue);

        System.out.println("summation is :"+iRet);
    }
}




