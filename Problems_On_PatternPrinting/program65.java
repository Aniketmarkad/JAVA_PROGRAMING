// input :- 4   *
//output :- *   *   *   *

//input :- 5  #
//output :- #   #   #   #   #


import java.util.*;
class Pattern
{
    void Display(int iNo,char ch)
    {
        if(iNo < 0 )
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            System.out.print(ch+"\t");
        }

    }
}

public class program65
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        char ch = '\u0000';

        System.out.println("Enter the frequency :");
        iValue = sobj.nextInt();

        System.out.println("enter the chracter:");
        ch = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        pobj.Display(iValue,ch);
    }
}

