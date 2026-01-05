// Accept input from user and allocate dynamic memory for array and return summation of element

import java.util.*;

class ArrayX
{
    int Summation(int Arr[], int iSize)
    {
        int iCnt = 0, iSum = 0;
        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
}

public class program114
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iCnt = 0, iRet = 0;
        int Arr[] = null;

        System.out.println("enter the size of array:");
        iLength = sobj.nextInt();

        Arr = new int[iLength];

        if (Arr == null)
        {
            System.out.println("unable to allocate the memory");
            return;
        }

        System.out.println("enter the element in array:");
        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        iRet = aobj.Summation(Arr, iLength);

        System.out.println("summation of element is :" + iRet);
    }
}

