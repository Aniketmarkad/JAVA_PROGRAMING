// Simpal Array take input from user display  its all element 

import java.util.Scanner;

public class program93
{
     public static void main (String a[])
    {
        Scanner sobj = new Scanner(System.in);

       int Arr[] ={0,0,0,0,0};
        int i = 0;

       for(i = 0;i< Arr.length;i++)
       {
           
            Arr[i] = sobj.nextInt();
       }

       for(i = 0;i <  Arr.length;i++)
       {
            System.out.println(Arr[i]);
       }
    }       
    
}





