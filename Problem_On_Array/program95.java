// Take input from user and display its all the element

import java.util.*;   

class ArrayX
{
    void Display (int Arr[],int iSize)
    {
        int i = 0;
        for(i = 0;i < Arr.length ;i++)
        {
            System.out.println(Arr[i]);
        }
       
    }
}

public class program95
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the size of array : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
         
        System.out.println("enter the element :");

         for(i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        aobj.Display(Arr,iSize);

    }
}

