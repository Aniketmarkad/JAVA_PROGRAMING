// Input : 4    4
/*
   *    *   *   *
   #    #   #   #
   *    *   *   *
   #    #   #   #
*/

import java.util.*;
class Pattern
{
    void Display(int iRow,int iCol)
    {
        int j = 0 ,i = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j= 1; j <= iCol; j++)
            {
                if(i % 2 != 0 )
                {
                     System.out.print("*\t");
                }
                else
                {
                     System.out.print("#\t");
                }
               
            }
            System.out.println(" ");
        }
    }
}

public class program72
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the no row :");
        int iValue1 = sobj.nextInt();

        System.out.println("enter the no of colmn :");
        int iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
        
    }
}





