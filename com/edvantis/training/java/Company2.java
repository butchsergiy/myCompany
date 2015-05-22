package com.edvantis.training.java;

import com.edvantis.training.java.model.Worker;




public class Company2 {
	public static void main(String[] args) {
	
		Worker[] workers=new Worker[3];								
	
		workers[1]=new Worker();					
						
//		workers[1].fio = "Dido Vasil Vasilovich";
		workers[1].setFIO("Dido Vasil Vasilovich");
		workers[1].age=35;
		workers[1].position="director";
		workers[1].salary=5000;
		workers[1].printAll();
		
		Worker.prnt(workers[1]);				//working only if prnt is static method
	//	Worker.prnt(workers[2]);	
						
	}
}