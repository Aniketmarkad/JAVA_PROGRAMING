// Check wheather the element is present in array or not

import java.util.*;   

class ArrayX
{
    boolean Search(int Arr[],int iSize,int iNo)
    {
        int i = 0;

        for(i = 0;i < Arr.length ;i++)
        {
            if(Arr[i] == iNo )
            {
                break;
            }
           
        }

        if( i == iSize )
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

public class program101
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        boolean bRet = false;

        System.out.println("Enter the size of array : ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the element that you want to search : ");
        int iValue = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("enter the element :");
        
        for(i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        bRet = aobj.Search(Arr,iSize,iValue);
        
        if(bRet == true)
        {
            System.out.println("element is present");
        }
        else
        {
            System.out.println("element is not present");
        }
    }
    
}    


