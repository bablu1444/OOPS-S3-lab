// Electricity Bill by creating a Separate class

import java.util.*; 
class ElectricityBills
{	
	double billpay;

	CalculateElectricityBill(long units)
	{
  	  if(units<100)
		billpay=units*1.20;
	  else if(units<=300)
		billpay=100*1.20+(units-100)*2;
	  else if(units>300)
		billpay=100*1.20+200 *2+(units-300)*3;
	     
         }	 

	
}
class ComputeElectricityBill 
{ 
        public static void main(String args[]) 
        {   
	    long units;

	    Scanner sc=new Scanner(System.in);

	    System.out.println("enter number of units");
	   
            units=sc.nextLong();

            CalculateElectricityBill b=new CalculateElectricityBill(units);
        	
      	    System.out.println("Bill to pay : " + b.billpay); 
   } 
}