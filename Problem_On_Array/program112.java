// Accept input from user and allocate dynamic memory for array and display element

import java.util.*;

public class program112
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        int Arr[] = null;

        System.out.println("enetr the length of array:");
        iLength = sobj.nextInt();

        Arr = new int[iLength];

        if (Arr == null)
        {
            System.out.println("unable to allocate memory");
            return;
        }

        System.out.println("enter the element :");
        int iCnt = 0;

        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("entered element from the array:");

        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

