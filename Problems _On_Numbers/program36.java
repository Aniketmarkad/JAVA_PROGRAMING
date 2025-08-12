//accept the input from user and display its  factors and non  factors

import java.util.*;

class Number
{

    public void DisplayNonFactor(int iNo)
    {
       int i = 0;

       for(i =1; i < iNo;i++)
       {
            if(iNo % i == 0 )
            {
                System.out.println(i+" : is factor of"+iNo);
            }
            else
            {
                System.out.println(i+" : is not factor of"+iNo);
            }
       }
       
    }
}

public class program36
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter the number  :");
        iValue1 = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayNonFactor(iValue1);

    }
}





