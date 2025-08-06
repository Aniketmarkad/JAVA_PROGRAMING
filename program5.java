//accept the input from user and find the sum of  its factors

import java.util.*;

class Number
{

    public int  SumFactor(int iNo)
    {
       int i = 0,iSum = 0 ;

       for(i =1; i <= iNo/2;i++)
       {
            if(iNo % i == 0 )
            {
                iSum = iSum + i;
            }
       }
       return iSum;
    }
}

public class program5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 =0,iRet = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        iRet = nobj.SumFactor(iValue1);

        System.out.println("addtion of factor is :"+iRet);
       
    }
}


