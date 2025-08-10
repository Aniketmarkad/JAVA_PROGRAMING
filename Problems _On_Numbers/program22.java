// Accept input from user and check number is even or not 

import java.util.*;

class Number
{

    public Boolean CheckEven(int iNo)
    {
        return (iNo % 2 == 0);
    }
}

public class program22
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet= false;


        System.out.println("Enter the number  :");
        int iValue1 = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckEven(iValue1);
        if(bRet == true)
        {
            System.out.println("number is even ");
        }
        else
        {
            System.out.println("number is not even");
        }
    }
}


