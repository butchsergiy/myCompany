package com.edvantis.training.java;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.edvantis.training.java.dataOp.OperationsInterface;
import com.edvantis.training.java.dataOp.Operations;
import com.edvantis.training.java.model.Worker;
import java.util.Arrays;



public class Company3 {

	public static void main(String[] args) {
	
		String command=" ";
		String file="e:/Company.txt";
		String menu="What woud you like to do? \n ";
		menu+="\n p - Print file \n a - Add new worker \n l - load data to ram (for futher func.) ";
		menu+="\n s - print all workers Surnames \n e - print average workers age \n r - soRt list of workers by FIO";
		menu+="\n c - Count salary \n b - Count this month salary with bonus";
		menu+="\n ------ \n x - eXit ";

		
		Worker[] workers=new Worker[99];
		OperationsInterface ii=new Operations();
		
		
		try{
		
			while( !command.equalsIgnoreCase("x") ){
				
				command=JOptionPane.showInputDialog(menu);
				
				if(command.equalsIgnoreCase("p")){
					System.out.println("\n*** You chouse to print the file *** \n** FILE : \n");		
//					Operations.PrintAllFile(file);
//					OperationsInterface ii=new Operations(); 		// specialno dla Vas  ...  I show here work over interface  
					ii.PrintAllFile(file);							// but as for me it better to use static methods. I like them better.
					}
				
				
				if(command.equalsIgnoreCase("a")){
					System.out.println("\n*** You want to add new worker  ***\n");
					Operations.AddWorker(file, Operations.enterNewWorker());
					workers=Operations.loadData(file);
					}			
				
				
				if(command.equalsIgnoreCase("c")){
					System.out.println("\n*** You want to count salary ***\n");
					workers=Operations.loadData(file);
					Operations.getSumSellary(workers);
					}
				
				if(command.equalsIgnoreCase("b")){
					System.out.println("\n*** You want to count this month salary with bonus ***\n");
					workers=Operations.loadData(file);
					Operations.getSumSellaryWB(workers);
					}
				
				if(command.equalsIgnoreCase("l")){
					System.out.println("\n*** You want to load data from file ***\n");
					workers=Operations.loadData(file);
					}
				
				if(command.equalsIgnoreCase("s")){
					System.out.println("\n*** You want to print all workers surnames ***\n");
					workers=Operations.loadData(file);
					ii.printAllSurnames(workers);
					}
				
				if(command.equalsIgnoreCase("e")){
					System.out.println("\n*** You want to print average workers age  ***\n");
					workers=Operations.loadData(file);
					ii.findAverageAge(workers);
					}
				
				if(command.equalsIgnoreCase("r")){
					System.out.println("\n*** You want to sort  ***\n");
					//////////////////////////////////////////////////////////////////////
					System.out.println("\n*** You want to sort  ***\n");				
					workers=Operations.loadData(file);
					
					System.out.println("\n*** 1. before sort array  ***\n");
					ii.printAllSurnames(workers);
										
					try{
					Arrays.sort(workers,1,8);
//					Arrays.sort(workers); 				// not working  becouse in array workers I have null objects
						}
					catch(ClassCastException e){System.out.println(e);};
					
					System.out.println("\n*** 2. after sort array ***\n");
					ii.printAllSurnames(workers);
					
					
					}
				
			}
			
		}
		
		catch(FileNotFoundException e){
			System.out.println(" Cant find File " + file);
			}
		
		catch(IOException e){
			System.out.println(e);
			}
		
		catch(NumberFormatException e){
			System.out.println("*** Program terminated. Wrong data where must be number. \n"+e);
			}
		
		catch(NullPointerException e){
			System.out.println("\n\n*** Cancel pressed. Program terminated. \n"+e);
			}
		
	
		System.out.print("\n *************\n * Thats all * \n *************");

	}
}
