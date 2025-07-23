import java.util.*;

class Arithmatic
{
    float CalculatePercentage(int iTotal, int iObtained)
    {
        float fAns = 0.0f;
        fAns = (((float)iObtained) / ((float)iTotal) * 100);
        return fAns;

    }
}

public class p2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iTotal = 0, iObtained = 0;
        float fRet = 0.0f;

        System.out.println("enter total marks :");
        iTotal = sobj.nextInt();

        System.out.println("enter your obtained marks :");
        iObtained = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        fRet = aobj.CalculatePercentage(iTotal,iObtained);
        System.out.println("your percentage is "+fRet);

    }
}
