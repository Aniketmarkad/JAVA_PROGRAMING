//itreation  9 + 8 +  7 +  6  + 5  + 4  + 3  + 2 +  1 dynamic code
import java.util.*;
class Arithematic
{
    int Display(int ino)
    {
        int iSum = 0;
        int icnt = 0;

        for(icnt = ino; icnt >= 1; icnt--) 
        {
            iSum = iSum + icnt;
        }

        return iSum;
    
    }
}

public class p18 
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0,iRet = 0;

        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iRet = aobj.Display(ivalue);

        System.out.println("summation is :"+iRet);
    }
}




