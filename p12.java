//itreation  1  2   3   4   5
import java.util.*;
class Arithematic
{
    void Display()
    {
        int icnt = 0;
        for(icnt = 1; icnt <= 5; icnt++) 
        {
            System.out.println(icnt);
        }
    }
}

public class p12 
{
    public static void main(String a[])
    {
        /*Scanner sobj = new Scanner (System.in);
        int ivalue = 0;

        System.out .println("enter how many times you want to print");
        ivalue = sobj.nextInt();*/

        Arithematic aobj = new Arithematic();

        aobj.Display();
    }
}

