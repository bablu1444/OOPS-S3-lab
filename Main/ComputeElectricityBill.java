//Taking Inputs through command line arguments 


import java.util.*;
class ComputeElectricityBill 
{ 
        public static void main(String args[]) 
        {   
	long units;
	units=Long.parseLong(args[0]);  // collect the data from cli and pass it to hell.
			// treats bill amount gradually based on the scale.
			/*Scale:
			 * Till 100 units: 1.20
			 * 100-> 300: additional 2 over every 100
			 * 300 above: Additional 3 slab wise
			 */
	double billpay=0;
        	if(units<100)
		billpay=units*1.20;
	else if(units<=300)
		billpay=100*1.20+(units-100)*2;
	else if(units>300)
		billpay=100*1.20+200*2+(units-300)*3;
      	 System.out.println("Bill to pay : " + billpay); 
   } 
}