package com.edvantis.training.java.model;



public class Project{
	
	String projectName; 	// projectName
		
	String customerName; 	// customerName
		
	int numberOfWorkers; 	// number of team members
	
	// team members
	// Worker[] =new Worker[numberOfWorkers];
	
	// date of start
	
	// date of end
		
	int durationDays; 		// duration of project in days
		
	int durationManHours; 	// duration of project in man hours
		
	int cost; 				// project cost - собівартість
	
	
	int costForCustomer; 	// project cost for customer
		
	int expensesOffice; 	// office expenses
		
	int expensesAdditional; 	// additional expenses
		
	int returnRate;			// The rate of return - норма прибутку
	
	Project(){				// constructor
		numberOfWorkers=0;
		returnRate=50;
		expensesOffice=1000;
		
	}
}