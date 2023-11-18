import java.util.*;

class Leatherwallet
{
    int Lunit_price=1100;
    int LQuantity=1;
    void calculate()
    {
        int value;
        int Total;
        float Disvalue;
        float LGST;
        value=Lunit_price*LQuantity;
        LGST=value*18/100;
        Total1=value+LGST;
        Disvalue=Total1*5/100;//As the product unit price is greater than 500, 5% Discount//
        Total1=Total1-Disvalue;
    }
}
class Umbrella
{
    int Uunit_price=900;
    int UQuantity=4;
    void calculateU()
    {
        int value;
        int Total2;
        float Disvalue;
        float UGST;
        value=Uunit_price*UQuantity;
        UGST=value*12/100;
        Total2=value+LGST;
        Disvalue=Total2*5/100;//As the product unit price is greater than 500, 5% Discount//
        Total2=Total2-Disvalue;
    }
}
class Cigarette
{
    int Cunit_price=1100;
    int CQuantity=1;
    void calculateC()
    {
        int value;
        int Total3;
        float Disvalue;
        float CGST;
        value=unit_price*Quantity;
        CGST=value*28/100;
        Total3=value+LGST;
        Disvalue=Total3*0/100;//As the product unit price is less than 500,No Discount//
        Total3=Total3-Disvalue;
    }
}
class Honey
{
    int Hunit_price=1100;
    int HQuantity=1;
    void calculateH()
    {
        int value;
        int Total4;
        float Disvalue;
        float HGST;
        value=Hunit_price*HQuantity;
        HGST=value*18/100;
        Total4=value+LGST;
        Disvalue=Total4*/100;//As the product unit price is less than 500, No Discount//
        Total4=Total4-Disvalue;
    }
}
class sample()
{
    public static void main(String[]args)
    {
        float Total_AMOUNT;
        Leatherwallet obj1=new Leatherwallet();
        Umbrella obj2=new Umbrella();
        Cigarette obj3=new Cigarette();
        Honey obj4=new Honey();
        obj1.calculate();
        obj2.calculateU();
        obj3.calculateC();
        obj4.calculateH();
        Total_AMOUNT=Total1+Total2+Total3+Total4;
        System.out.println("Total amount to be paid is Rs."+Total_AMOUNT);
        //To find out MAX GST paid//
        if(LGST>UGST && LGST>CGST)
        {
            System.out.println("Leatherwallet GST is MAX");
        }
        else if(UGST>LGST && UGST>CGST)
        {
            System.out.println("Umbrella GST is MAX");
        }
        else
        {
             System.out.println("Cigarette GST is MAX");
        }

    }
}
