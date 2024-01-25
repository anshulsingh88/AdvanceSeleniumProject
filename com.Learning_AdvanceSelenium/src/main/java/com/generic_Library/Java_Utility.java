package com.generic_Library;

import java.util.Date;
import java.util.Random;

public class Java_Utility {
	
	public static  int getRandomNumber()
	{
		Random random=new Random(1000);
		return  random.nextInt();
		
	}

	public static String getName()
	{
		 String date=new Date().toString().replace(" ","_").replace(":", "_");
		 return date;
		 
		 
	}
}
