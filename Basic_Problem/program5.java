// Taking input from user and without  using static function addtion is perform by creating object of same class

import java.util.Scanner;

public class program5
{
    public int Addition(int iNo1,int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;

        return iAns;
    }

    public static void main(String a[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value :");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second value : ");
        int iValue2 = sobj.nextInt();

        program5 pobj = new program5();

        iRet =pobj.Addition(iValue1,iValue2);

        System.out.println("Addition is :"+iRet);
    }

}

