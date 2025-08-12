//accept the input from user and display its   factor with optimaziation in its timecomplexcity

import java.util.*;

class Number
{

    public void DisplayFactor(int iNo)
    {
       int i = 0;

       if(iNo < 0)           // updator
       {
            iNo = -iNo;
       }

       System.out.println(" factor are :");
       for(i =1; i < iNo/2;i++)
       {
            if(iNo % i == 0 )
            {
                System.out.println(i);
            }
       }
    }
}

public class program32
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 =0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFactor(iValue1);
       
    }
}





