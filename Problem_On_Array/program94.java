// Take input from user and display its all the element

import java.util.*;   

class ArrayX
{
    void Display (int Arr[],int iSize)
    {
        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);
        System.out.println(Arr[4]);
    }
}

public class program94 
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
