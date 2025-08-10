// Taking input from user and using static function addtion is perform

import java.util.Scanner;

public class program4 
{
    public static int Addition(int iNo1,int iNo2)
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

        iRet = Addition(iValue1,iValue2);

        System.out.println("Addition is :"+iRet);
    }

}
