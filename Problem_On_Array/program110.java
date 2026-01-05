// Create an array, take input from user and display element from array using loop

import java.util.*;

class ArrayX
{
    void Display(int Arr[], int iSize)
    {
        System.out.println("element from array is :");

        int iCnt = 0;

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

public class program110
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];
        int iCnt = 0;

        System.out.println("enter the array element :");

        for (iCnt = 0; iCnt < 5; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr, 5);
    }
}

