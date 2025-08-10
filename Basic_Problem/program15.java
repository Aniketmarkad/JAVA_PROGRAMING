// taking input from user and Using itreation  print number up to that number on screen

import java.util.Scanner;

class Arithematic
{
    void Display(int iNo)
    {
        //itreation 
        int icnt = 0;
        for(icnt = 1; icnt <= iNo; icnt++) 
        {
            System.out.println(icnt);
        }
    }
}

public class program15
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number that :");
        int iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.Display(iValue);
    }
}



