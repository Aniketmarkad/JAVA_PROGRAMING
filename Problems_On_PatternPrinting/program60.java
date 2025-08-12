// input :- 4
//output :- 4   3   2   1   0

import java.util.*;
class Pattern
{
    void Display(int iNo)
    {
        if(iNo < 0 )
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        for(iCnt = iNo;iCnt >= 0;iCnt--)
        {
            System.out.print(iCnt+"\t");
        }

    }
}

public class program60
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




