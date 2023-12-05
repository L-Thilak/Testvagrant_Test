import java.util.*;

class Leatherwallet 
{
    int Lunit_price=1100;
    int LQuantity=1;
    int value;
    public int Total1;
        int Disvalue;
        int LGST;
    int calculate()
    {
        value=Lunit_price*LQuantity;
        LGST=value*18/100;
        Total1=value+LGST;
        Disvalue=Total1*5/100;//As the product unit price is greater than 500, 5% Discount//
        Total1=Total1-Disvalue;
        return Total1;
    }
    
}
class Umbrella extends Leatherwallet
{
    int Uunit_price=900;
    int UQuantity=4;
    int value;
        int Total2;
        int Disvalue;
        int UGST;
    int calculateU()
    {
        value=Uunit_price*UQuantity;
        UGST=value*12/100;
        Total2=value+UGST;
        Disvalue=Total2*5/100;//As the product unit price is greater than 500, 5% Discount//
        Total2=Total2-Disvalue;
        return Total2;
        
    }
}
class Cigarette extends Umbrella
{
    int Cunit_price=200;
    int CQuantity=3;
    int value;
        int Total3;
        int Disvalue;
        int CGST;
    int calculateC()
    {
        value=Cunit_price*CQuantity;
        CGST=value*28/100;
        Total3=value+CGST;
        Disvalue=Total3*0/100;//As the product unit price is less than 500,No Discount//
        Total3=Total3-Disvalue;
        return Total3;
    }
}
class Honey extends Cigarette
{
    int Hunit_price=100;
    int HQuantity=2;
    int value;
        int Total4;
        int Disvalue;
        int HGST;
    int calculateH()
    {
        value=Hunit_price*HQuantity;
        HGST=value*0/100;
        Total4=value+HGST;
        Disvalue=Total4*0/100;//As the product unit price is less than 500, No Discount//
        Total4=Total4-Disvalue;
        return Total4;
    }
}

public class Main
{
    public static void main(String[]args)
    {
        int Total_AMOUNT;
        Leatherwallet obj1=new Leatherwallet();
        Umbrella obj2=new Umbrella();
        Cigarette obj3=new Cigarette();
        Honey obj4=new Honey();
       // calculat obj5=new calculat();
        int a=obj1.calculate();
        int b=obj2.calculateU();
        int c=obj3.calculateC();
        int d=obj4.calculateH();
       // obj5.funt();
        Total_AMOUNT=a+b+c+d;
        System.out.println("Total amount to be paid is Rs."+Total_AMOUNT);
        //To find out MAX GST paid//
        
}
    }
