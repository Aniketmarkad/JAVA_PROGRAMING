// check whether the element is present in array or not

import java.util.*;

class ArrayX
{
    boolean Search(int Arr[], int iSize)
    {
        int iCnt = 0;
        boolean bFlage = false;

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            if (Arr[iCnt] == 11)
            {
                bFlage = true;
            }
        }
        return bFlage;
    }
}

public class program119
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0, iLength = 0;
        int Arr[] = null;
        boolean bRet = false;

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
        bRet = aobj.Search(Arr, iLength);

        if (bRet == true)
        {
            System.out.println("element is present ");
        }
        else
        {
            System.out.println("element is not present");
        }
    }
}

