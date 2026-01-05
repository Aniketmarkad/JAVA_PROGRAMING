// accept array from user and check the maximum and minimum element in array

import java.util.*;

class ArrayX
{
    void MaximumMinimum(int Arr[], int iSize)
    {
        int iCnt = 0, iMin = Arr[0];

        if ((Arr == null) || (iSize <= 0))
        {
            return;
        }

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            if (iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }
        }

        int iMax = Arr[0];

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            if (iMax < Arr[iCnt])
            {
                iMax = Arr[iCnt];
            }
        }

        System.out.println("minimum element is :" + iMin);
        System.out.println("maximum element is :" + iMax);
    }
}

public class program127
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0, iLength = 0;
        int Arr[] = null;

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

        aobj.MaximumMinimum(Arr, iLength);
    }
}
