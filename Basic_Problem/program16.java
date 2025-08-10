// Take input from user and  print that times jay ganesh with counting  on screen Using itreation  

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

public class program16
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
