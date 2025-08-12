// input :- 4
//output :- -4   -3   -2   -1   0   1   2   3   4

import java.util.*;
class Pattern
{
    void Display(int iNo)
    {
        if(iNo > 0 )
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        for(iCnt = iNo;iCnt <= -iNo ;iCnt++)
        {
            System.out.print(iCnt+"\t");
        }

    }
}

public class program64
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the frequency :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);
    }
}


