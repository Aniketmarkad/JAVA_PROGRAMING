// Create an array, take input from user and display element from array

import java.util.*;

class ArrayX
{
    void Display(int Arr[], int iSize)
    {
        System.out.println("element from array is :");

        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);
        System.out.println(Arr[4]);
    }
}

public class program108
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
