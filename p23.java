//check wheather no is divisible by 3 & 5 or only 3 or only 5

import java.util.*;
class Arithematic
{
    void CheckDivisible(int ino)
    {

        if(((ino % 3) == 0 ) && ((ino % 5) == 0))
        {
            System.out.println(ino+" is divisible by both 3 & 5\n");
        }
        else if(((ino % 3)== 0))
        {
            System.out.println(ino+" is divible by 3\n");
        }
        else if((ino % 5) == 0)
        {
            System.out.println(ino+" is divisible by 5\n");
        }

        
    }
}

public class p23
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);
        int ivalue = 0;
       
        System.out .println("enter the number :");
        ivalue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.CheckDivisible(ivalue);

    }
        
}









