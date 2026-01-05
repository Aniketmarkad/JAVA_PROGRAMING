// check whether the character is small or not

import java.util.*;

class ArrayX
{
    boolean CheckSmall(char ch)
    {
        if (ch >= 97 && ch <= 122)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class program134
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';
        boolean bRet = false;

        System.out.println("Enter the character :");
        ch = sobj.next().charAt(0);

        ArrayX aobj = new ArrayX();
        bRet = aobj.CheckSmall(ch);

        if (bRet == true)
        {
            System.out.println(ch + " : is small ");
        }
        else
        {
            System.out.println(ch + " : is not small ");
        }
    }
}
