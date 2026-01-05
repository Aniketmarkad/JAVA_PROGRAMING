// Accept input from user and allocate dynamic memory for array and display element

import java.util.*;

class ArrayX
{
    void Display(int Arr[], int iSize)
    {
        int iCnt = 0;
        System.out.println("entered element from the array:");

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

public class program113
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

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr, iLength);
    }
}

