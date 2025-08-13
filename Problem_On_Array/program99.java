// Take input from user and return its sumof even element

import java.util.*;   

class ArrayX
{
    int SumEven(int Arr[],int iSize)
    {
        int i = 0;
        int iSum = 0;

        for(i = 0;i < Arr.length ;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iSum = iSum + Arr[i];
            }
           
        }

       return iSum;
    }
}

public class program99
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        int iRet = 0;

        System.out.println("Enter the size of array : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("enter the element :");
        
        for(i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        iRet = aobj.SumEven(Arr,iSize);
        
        System.out.println("summation is :"+iRet);

    }
}




