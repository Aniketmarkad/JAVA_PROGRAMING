// accept input from user and display ascii value of that character

import java.util.*;

public class program130
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';

        System.out.println("Enter the Character :");

        ch = sobj.next().charAt(0);

        System.out.println("ASCII value of " + ch + " is :" + (int)ch);
    }
}

