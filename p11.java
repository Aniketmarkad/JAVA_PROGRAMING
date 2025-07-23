//itreation 
import java.util.*;
class Arithematic
{
    void Display(int ino)
    {
        int icnt = 0;
        for(icnt = 1; icnt <= ino; icnt++) 
        {
            System.out.println(icnt+":Jay Ganesh..!!!!");
        }
    }
}

public class p11 
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
