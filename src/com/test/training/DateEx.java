package com.test.training;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateEx {

	public static void main(String[] args) {
		
	    LocalDate date = LocalDate.now();
	    System.out.println("the current date is "+
	                        date);

	    LocalTime time = LocalTime.now();
	    System.out.println("the current time is "+
	                        time);

	    LocalDateTime current = LocalDateTime.now();
	    System.out.println("current date and time : "+
	                        current);

	    DateTimeFormatter format =
	      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	   
	    String formatedDateTime = current.format(format); 
	    
	    System.out.println("in foramatted manner "+
	                        formatedDateTime);
	  
	
	    Month month = current.getMonth();
	    int day = current.getDayOfMonth();
	    int seconds = current.getSecond();
	    System.out.println("Month : "+month+" day : "+
	                        day+" seconds : "+seconds);

	    LocalDate date2 = LocalDate.of(1950,1,26);
	    System.out.println("the republic day :"+date2);
	  

	    LocalDateTime specificDate =
	        current.withDayOfMonth(24).withYear(2016);
	 
	    System.out.println("specific date with "+
	                       "current time : "+specificDate);
	}
	 

	}


