// accept array from user and check the mimimum element in array

import java.util.*;

class ArrayX
{
    int Minimum(int Arr[], int iSize)
    {
        int iCnt = 0, iMin = Arr[0];

        if ((Arr == null) || (iSize <= 0))
        {
            return -1;
        }

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            if (iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;
    }
}

public class program126
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0, iLength = 0;
        int Arr[] = null;
        int iRet = 0;

        System.out.println("enter size of array:");
        iLength = sobj.nextInt();

        Arr = new int[iLength];

        if (Arr == null)
        {
            System.out.println("unable to allocate the memory");
            return;
        }

        System.out.println("enter the element :");

        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        iRet = aobj.Minimum(Arr, iLength);

        if (iRet == -1)
        {
            System.out.println("there is problem in input");
        }
        else
        {
            System.out.println(" minimum element is : " + iRet);
        }
    }
}

