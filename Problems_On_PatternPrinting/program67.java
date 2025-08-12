/* 
    #   #   #
    #   #   #
    #   #   #

 */

import java.util.*;
class Pattern
{
    void Display()
    {
        int j = 0 ,i = 0;

        for(i = 1; i <= 3; i++)
        {
            for(j= 1; j <= 3; j++)
            {
                System.out.print("#\t");
            }
            System.out.println("");
        }


    }
}

public class program67
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        pobj.Display();
    }
}


