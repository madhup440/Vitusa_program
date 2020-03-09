package ntw.virtusa.com;
//import ntw.virtusa.constants.com;

import java.util.*;

public class NumberToWords {
	
 
public static void main(String[] args) {
	int num=0;
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Please enter a numer max upto 9 digits:");
		num=sc.nextInt();
		
	if(num==0) {
		System.out.println("numer in words is:Zero");
	}
	else
	{
		System.out.println("numer in words is:"+numToWords(num));
	}
}
	catch(Exception e)
	{
	System.out.println("Please enter valid numer");
	}
	finally {
	sc.close();
	}
}


	public static String numToWords(int num)
	{
	String words="";
	String unitArrays[]= {"Zero","One","two","three","four","five","six","seven","eight","nine","eleven","twel","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	
	String tensArray[]={"Zero","ten","twenty","thrity","fourty","fifty","sixety","seventy","eighty","ninety"};
			if(num==0) {
		return "Zero";
	}
	if(num<0)
	{
		// convert number to String
		String numtoStrng="";
		numtoStrng=numtoStrng.substring(1);
		return "Minus"+numToWords(Integer.parseInt(numtoStrng));
	}
	//Check given number is divisible by 1000000
	if((num/1000000)>0) 
   {
	words+=numToWords(num/1000000)+"millian";
num=num%1000000;
   }
   if((num/1000)>0)
   {
	   words+=numToWords(num/1000)+"thousand";
      num=num%1000;
   }
   if((num/100)>0)
   {
	   words+=numToWords(num/100)+"hundred";
       num=num%100;
   }
   
   if(num>0)
   {//check given number in units of array
	   if(num<20)
	   {
		   words+=unitArrays[num];
   }
	   else {
		   words+=tensArray[num/10];
		   if((num%10)>0)
		   {
			   words+="-"+unitArrays[num%10];
		   }
   }
	   }
   return words;
   }
}

