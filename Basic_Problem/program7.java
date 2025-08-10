// Taking input from user and without  using  different class perform Addition;

import java.util.Scanner;

class Arithmatic
{
    public int iNo1;
    public int iNo2;

    public Arithmatic(int a,int b)
    {
        this.iNo1 = a;
        this.iNo2 = b;

    }

    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;

        return iAns;
    }

}

public class program7
{

    public static void main(String a[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value :");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second value : ");
        int iValue2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue1,iValue2);

        iRet =aobj.Addition();

        System.out.println("Addition is :"+iRet);
    }

}



