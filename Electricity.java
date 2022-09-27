import java.util.*;
class Electricity
{ 
    private double res;
    private void minbill(double unit)
    {
        System.out.println("Electricity bill: Free");
    }
    class Bill{
        //double res;
        void maxbill(double unit)
        {
            if(unit<=200)
            {
                res = 100*0 + (unit-100)*2;
                System.out.println("Electricity bill:"+res);
            }
            else if(unit<300)
            {
                res = (100*0) + (200*2) + (unit - 200)*3; 
                System.out.println("Electricity bill:"+res);
            }
            else if(unit > 300)
            {
                
                 res = 100*0 + 200*2 +(unit - 300)*4;  
                  System.out.println("Electricity bill:"+res);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units:");
        double unit = sc.nextDouble(); 
        Electricity e = new Electricity();
        Electricity.Bill b = e.new Bill();
        if(unit <= 100)
        {
          e.minbill(unit);
        }
        else if(unit > 100)
        {
          b.maxbill(unit);
        }
    }
}
