// Accept input from user and return summation element from array

import java.util.*;

class ArrayX
{
    int Summation(int Arr[], int iSize)
    {
        int iCnt = 0, iSum = 0;

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = Arr[iCnt] + iSum;
        }

        return iSum;
    }
}

public class program111
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];
        int iCnt = 0, iRet = 0;

        System.out.println("enter the array element :");

        for (iCnt = 0; iCnt < 5; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        iRet = aobj.Summation(Arr, 5);

        System.out.println("Summation of array element is :" + iRet);
    }
}

