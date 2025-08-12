//accept the input from user and display its sum of factors and non  factors

import java.util.*;

class Number
{

    public void Summation(int iNo)
    {
       int i = 0,iSum1 = 0, iSum2 = 0;

       for(i =1; i < iNo;i++)
       {
            if(iNo % i == 0 )
            {
                iSum1 = iSum1 + i;
            }
            else
            {
                iSum2 = iSum2 + i;
            }
       }
       System.out.println("Summation of factors is :"+iSum1);
       System.out.println("Summation of non factor is :"+iSum2);
       
    }
}

public class program37
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        nobj.Summation(iValue1);

    }
}




