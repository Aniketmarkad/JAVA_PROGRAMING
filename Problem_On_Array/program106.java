// Create an array, take input from user and display using loop

import java.util.*;

public class program106
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("enter the array element");

        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

        System.out.println("element froma array is :");

        int iCnt = 0;
        for (iCnt = 0; iCnt < 5; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

