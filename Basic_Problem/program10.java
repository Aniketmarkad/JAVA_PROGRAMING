/*
    Start
        Accept age from user
            If age is less than 5 then there will no ticket
            If it is in between 5 to 18 then it will be 700
            It it is in betwween 18 to 50 it will be 999
            And if it is greater than 50 then it will be 500
    Stop
*/
import java.util.*;

class Arithmatic
{
    int CalculateTickit(int iage)
    {
        int iPrice = 0;

    if(iage <= 0)
    {
        return -1;
    }

    if((iage > 0) && (iage < 5))
    {
        iPrice = 0;
    }
    else if((iage >= 5) && (iage < 18))
    {
        iPrice = 700;
    }
    else if((iage >= 18 ) && (iage < 50))
    {
        iPrice = 999;
    }
    else if((iage > 50) )
    {
        iPrice = 500;
    }

    return iPrice ;
    }

}
class program10
{
    public static void main(String a[])
    {
        int ivalue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your age ");
        ivalue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        iRet = aobj.CalculateTickit(ivalue);

        if (iRet == -1)
        {
            System.out.println("invalid input unable to calculate tickit");
        }
        else
        {
            System.out.println("your tickit price is :"+iRet);
        }
    }
}