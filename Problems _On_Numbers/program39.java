//accept the input from user and display its  odd factors

import java.util.*;

class Number
{

    public void DisplayoddFactor(int iNo)
    {
       int i = 0;

       if(iNo < 0)           // updator
       {
            iNo = -iNo;
       }

       System.out.println(" odd factor are :");
       for(i =1; i < iNo/2;i++)
       {
            if((iNo % i == 0 ) && (i % 2 != 0))
            {
                System.out.println(i);
            }
       }
    }
}

public class program39
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 =0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayoddFactor(iValue1);
       
    }
}







