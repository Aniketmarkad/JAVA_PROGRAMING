// check whether the character is Digit or not

import java.util.*;

class ArrayX
{
    boolean CheckDigit(char ch)
    {
        if (ch >= '0' && ch <= '9')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class program135
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';
        boolean bRet = false;

        System.out.println("Enter the character :");
        ch = sobj.next().charAt(0);

        ArrayX aobj = new ArrayX();
        bRet = aobj.CheckDigit(ch);

        if (bRet == true)
        {
            System.out.println(ch + " : is digit ");
        }
        else
        {
            System.out.println(ch + " : is not digit ");
        }
    }
}
