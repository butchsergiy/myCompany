package com.edvantis.training.java.model;



public class Developer extends Worker {
	
	String inProject="-";	// working on project  // ?
	
	public void printAll(){
		super.printAll();
		System.out.print(" in project:\t"+ inProject+"\n");	
	}
	
}