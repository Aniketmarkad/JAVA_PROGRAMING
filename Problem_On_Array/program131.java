// check whether the character is Capital or not

import java.util.*;

class ArrayX
{
    boolean CheckCapital(char ch)
    {
        if (ch >= 65 && ch <= 90)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class program131
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        char ch = '\0';
        boolean bRet = false;

        System.out.println("Enter the character :");
        ch = sobj.next().charAt(0);

        ArrayX aobj = new ArrayX();
        bRet = aobj.CheckCapital(ch);

        if (bRet == true)
        {
            System.out.println(ch + " : is capital ");
        }
        else
        {
            System.out.println(ch + " : is not capital ");
        }
    }
}
