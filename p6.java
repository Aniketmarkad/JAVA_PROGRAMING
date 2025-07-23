import java.util.*;
class Arithmatic
{
    void DisplayPercentage(float fperc)
    {
        
    if((fperc < 0.0f) || (fperc > 100.0f))
    {
        System.out.println("invalid syntax");
    }
    else if((fperc >= 0.0f) && (fperc < 35.0f))
    {
        System.out.println("fail class");
    }
    else if((fperc >= 35.0f) && (fperc < 50.0f))
    {
        System.out.println("pass class");
    }
    else if((fperc >= 50.0f) && (fperc < 60.0f))
    {
        System.out.println("second class");
    }
    else if((fperc >= 60.0f) && (fperc < 70.0f))
    {
        System.out.println("first class");
    }
    else if((fperc >= 70.0f) && (fperc <= 100.0f))
    {
        System.out.println("first clas with distiction");
    }
    }
}
class p6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        float fValue = 0.0f;

        System.out.println("enter the percentage:");
        fValue = sobj.nextFloat();

        Arithmatic aobj = new Arithmatic();
        
        aobj.DisplayPercentage(fValue);

    }
}