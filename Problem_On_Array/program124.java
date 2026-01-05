// accept array from user and check the frequency of the element in array

import java.util.*;

class ArrayX
{
    int Frequency(int Arr[], int iSize, int iValue)
    {
        int iCnt = 0, iCount = 0;

        if ((Arr == null) || (iSize <= 0))
        {
            return -1;
        }

        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            if (Arr[iCnt] == iValue)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

public class program124
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0, iLength = 0, iValue = 0;
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

        System.out.println("enter element that you want the frequncy :");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX();

        iRet = aobj.Frequency(Arr, iLength, iValue);

        if (iRet == -1)
        {
            System.out.println("there is problem in input");
        }
        else
        {
            System.out.println(iValue + " is present\t" + iRet + "\ttimes");
        }
    }
}
