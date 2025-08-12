//accept the input from user and display its non  factor

import java.util.*;

class Number
{

    public void DisplayNonFactor(int iNo)
    {
       int i = 0;

       System.out.println("non factor are :");
       for(i =1; i < iNo;i++)
       {
            if(iNo % i != 0 )
            {
                System.out.println(i);
            }
       }
    }
}

public class program34
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 =0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayNonFactor(iValue1);
       
    }
}


