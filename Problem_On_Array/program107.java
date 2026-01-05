// Create an array, take input from user and display using loop

import java.util.*;

public class program107
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("enter the array element");

        int iCnt = 0;
        for (iCnt = 0; iCnt < 5; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("element froma array is :");

        for (iCnt = 0; iCnt < 5; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

