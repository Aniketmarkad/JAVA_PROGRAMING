//accept the input from user and sum its non  factors

import java.util.*;

class Number
{

    public int Summation(int iNo)
    {
       int i = 0,iSum = 0;

       for(i =1; i < iNo;i++)
       {
            if(iNo % i != 0 )
            {
                iSum = iSum + i;
            }
       }
       return iSum;
    }
}

public class program35
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.Summation(iValue1);
        System.out.println("Summation of non factor is :"+iRet);
    }
}



