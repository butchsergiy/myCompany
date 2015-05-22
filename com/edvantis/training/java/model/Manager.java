package com.edvantis.training.java.model;



public class Manager extends Worker{
	String inProjects="-";	// working on project  // ?
	
	public void printAll(){
		super.printAll();
		System.out.print(" in project:\t"+ inProjects+"\n");	
	}
	
}