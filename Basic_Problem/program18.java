// Using itreation print   9  8   7   6   5   4   3   2   1 dynamic code

import java.util.*;
class Arithematic
{
    void Display(int ino)
    {
        int icnt = 0;
        for(icnt = ino; icnt >= 1; icnt--) 
        {
            System.out.println(icnt);
        }
    }
}

public class program18
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0;

        System.out .println("enter how many times you want to print");
        ivalue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.Display(ivalue);
    }
}



