// Input : 4    4
/*
  A  B   C   D
  A  B   C   D
  A  B   C   D
  A  B   C   D

*/

import java.util.*;
class Pattern
{
    void Display(int iRow,int iCol,char ch)
    {
        int j = 0 ,i = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1,ch = 'A'; j <= iCol; j++,ch++)
            {
                
                System.out.print(ch+"\t");
                   
            }
            System.out.println(" ");
        }
    }
}

public class program75
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the no row :");
        int iValue1 = sobj.nextInt();

        System.out.println("enter the no of colmn :");
        int iValue2 = sobj.nextInt();

        System.out.println("enter the no row :");
        char ch = sobj.next().charAt(0);
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2,ch);
        
    }
}







