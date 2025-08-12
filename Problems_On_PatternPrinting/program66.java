// input :- 4   *
//output :- *   *   *   *

//input :- 5  #
//output :- #   #   #   #   #


import java.util.*;
class Pattern
{
    void Display(int iNo,String str)
    {
        if(iNo < 0 )
        {
            iNo = -iNo;
        }
        int iCnt = 0;
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            System.out.print(str+"\t");
        }
    }
}

public class program66
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        String str = null;

        System.out.println("Enter the frequency :");
        iValue = sobj.nextInt();

        System.out.println("enter the chracter:");
        str = sobj.nextLine();

        Pattern pobj = new Pattern();

        pobj.Display(iValue,str);
    }
}


