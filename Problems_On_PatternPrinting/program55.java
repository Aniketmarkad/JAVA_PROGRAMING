// input :- 4
//output :- *   *   *   *

import java.util.*;
class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            System.out.print("*\t");
        }

    }
}

public class program55 
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
