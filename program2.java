// Accept 2 number from user and perform its addition..

import java.util.*;

class Arithematic
{
    private int  no1 ;
    private int  no2;

    public Arithematic(int a,int b)
    {
        this.no1 = a;
        this.no2 = b;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.no1 + this.no2;

        return Ans;
    }
}

public class program2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet= 0;

        System.out.println("Enter first element :");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter first element :");
        int iValue2 = sobj.nextInt();


        Arithematic aobj = new Arithematic(iValue1, iValue2);

        iRet = aobj.Addition();
        System.out.println(" Adiition of number is :"+iRet);
    }
}
