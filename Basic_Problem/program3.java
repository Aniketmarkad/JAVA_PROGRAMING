// Taking input from user using diffrent datatypes in java

import java.util.*;

class program3
{
    public static void main (String args [])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name :");
        String str = sobj.nextLine();

        System.out.println("Enter your age:");
        int age = sobj.nextInt();

        System.out.println("Enter your mark :");
        Float marks = sobj.nextFloat();


        System.out.println("Name is : "+str);
        System.out.println("Age is : "+age);
        System.out.println("Marks is :"+marks);
    }
}
