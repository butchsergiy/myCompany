package com.edvantis.training.java.model;

import java.time.LocalDate;





public class Worker extends WorkerAbstract implements Comparable<Worker>{
//Comparable<String>{
		
	private String 		fio="";			// full name
	public String		position; 	// position
	public LocalDate 	birthDate;  // birth date
	public int 			age=0;	// age
	public int 			salary=0;		// salary
	public int 			bonus=0;		// bonus
	public String 		MobNumber;
		

	public String getFIO() {
		return this.fio;
		}
	
	public void setFIO(String f) {
		this.fio=f;
		}
		
	public void printAll(){
		System.out.print("Worker Name:\t"+ this.getFIO()+"\n");
		System.out.print(" Birth date:\t"+ birthDate+"\n");   
		System.out.print(" Age:    \t"+ age +"\n");
		System.out.print(" Position:\t"+ position +"\n");
		System.out.print(" salary:\t"+ salary +"\n");
		}
		
	
	public static void prnt(Worker a) {											// print all fields of object of class Worker
		System.out.print("Worker Name: "+ a.getFIO()+"\n");
		System.out.print("Worker Birth date: "+ a.birthDate+"\n");   // ?
		System.out.print("Worker Age: "+ a.age +"\n");
		System.out.print("Worker Position: "+ a.position +"\n");
		System.out.print("Worker salary: "+ a.salary +"\n");
		System.out.print("Worker in project: "+ "zzz"+"\n");	// ?
		}


	@Override
	public int compareTo(Worker o) {
		return this.fio.compareToIgnoreCase(o.fio);
		}


	
}