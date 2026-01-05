// accept input from user and display the division of student

import java.util.*;

public class program129
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';

        System.out.println("enter your division :");

        ch = sobj.next().charAt(0);

        System.out.println("your division is :" + ch);
    }
}

