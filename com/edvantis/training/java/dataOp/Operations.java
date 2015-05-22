package com.edvantis.training.java.dataOp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import com.edvantis.training.java.model.Worker;




public class Operations implements OperationsInterface {                                              //extends OperationsAbstract{  ??
	
	
		
	public static void AddWorker(String file, String data) throws IOException{
				
		BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
						
		bw.write(data);
		bw.newLine();
		bw.flush();
		bw.close();
		}

	
	
	
	public static String enterNewWorker(){
		String newWorker, input;
		
		input=JOptionPane.showInputDialog("You'r adding new worker \n enter his Surname Name SecondName");
		newWorker=rightInput(input, 40);
						
		do{input=JOptionPane.showInputDialog("You'r adding new worker \n enter his Age");
			}while((!input.matches("[0-9]*")));
//			}while((!input.matches("[0-9]*"))&&(10<Integer.parseInt(input))&&(Integer.parseInt(input)<100));       // && dont works but dont know why
		newWorker+=rightInput(input, 5);
		
		do{	input=JOptionPane.showInputDialog("You'r adding new worker \n enter his Mobile Number");}
			while(!input.matches("[0-9]*"));
		newWorker+=rightInput(input, 13);		
			
		do{input=JOptionPane.showInputDialog("You'r adding new worker \n enter his salary");}
			while(!input.matches("[0-9]*"));
		newWorker+=rightInput(input, 8);
		
		do{input=JOptionPane.showInputDialog("You'r adding new worker \n enter his possition: \n m-manager \n d-developer ");}
		while(!input.matches("[nm]"));
		newWorker+=rightInput(input, 4);
	
		return newWorker;
		}
	
	
	
	
	
	private static String rightInput(String str, int q){

		if(str.length()>q) str=str.substring(0, q-1)+" ";
			
		if(str.length()<q) {
			while ((q-str.length())>0){
				str+=" ";	
				}}
		
		return str;
		}
	
		
	
	
	
	public void PrintAllFile(String file) throws IOException{
		FileInputStream fin=new FileInputStream(file);
		int a=fin.read();
		System.out.print("1:");
		int line=0;
		
		while(a!=-1){
			System.out.print((char)a);
			
			if (a==10) System.out.print((++line)+":");
			
			a=fin.read();
			}
		System.out.println();
		fin.close();
		}

	
	
	
		
	public static void getSumSellary(Worker[] w) {
		int i=0, summ=0;
		
		try{
			for (i=1; i<w.length-1; i++ ){
			
				System.out.println("+"+w[i].getFIO()+" salery = " +w[i].salary);
				System.out.println("summ = "+(summ+=w[i].salary));		
					}
			}
		
		catch(NullPointerException e){}
		finally{System.out.println("*** Total wage fund = "+summ);}
			
		}
		
	
	

	public static void getSumSellaryWB(Worker[] w) {
		int i=0, sum=0, b=0, busd=0;
		String input;
		
		System.out.println("\n\t*** This month salary with bonus ***");
				
		do{
		do{input=JOptionPane.showInputDialog("Enter this month bonus % for worker \n from 0- 200 %");
		}while((!input.matches("[0-9]*")));
			b=Integer.parseInt(input);
		}while((b<0)|(200<b));       
		
		try{
		try{
			for (i=1; i<w.length-2; i++ ){
			
				System.out.println("+"+w[i].getFIO()+" salery = " +w[i].salary+" + bonus "+ (w[i].salary*b/100));
				System.out.println("summ = "+(sum+=w[i].salary+w[i].salary*b/100));		
					}
			
			}catch(NullPointerException e){}
			busd=sum*b/100;
		}
		
		catch(ArithmeticException e){}
		finally{
			
			System.out.println("*** This month salary with bonus = "+sum+"\n*** Bonus = "+b+" % = "+ busd+" USD.");}
		}
		
	
	

	
	public static Worker[] loadData(String file)throws IOException{
		
		String b;
		Worker[] workers=new Worker[20];

		FileInputStream fin=new FileInputStream(file);
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			b=br.readLine();	
			b=br.readLine();
			int i=1;
			
			try{
			do{
				workers[i]=new Worker();
				workers[i].setFIO(b.substring(0, 40));
				workers[i].age=Integer.parseInt((b.substring(40, 45)).trim()); 					// need to write code for case when field blank
				workers[i].MobNumber = b.substring(45, 58);
				workers[i].salary=Integer.parseInt((b.substring(58, 64)).trim());
				workers[i].position=(b.substring(64, 68).trim());
								
//				workers[i].printAll();
				
				i++;
				b=br.readLine();
				
			}while(true);
			
			}catch(NullPointerException e){
//				System.out.println(e);
				}
			
			fin.close();

			return workers;
		}
		
	
	
	
	
	
	public void printAllSurnames(Worker[] w){
		
		System.out.println(w.length);
		try{
		for (int i=1; i<w.length; i++ ) System.out.println(w[i].getFIO());
		}catch(NullPointerException e){
//				System.out.println(e);
				}
	}
		
	
	
	
	
	public void findAverageAge(Worker[] w){
		
		System.out.println(w.length);
		int i=0,s=0;
		try{
			for (i=1; i<w.length; i++ ){
			s+=w[i].age;
				}
			}
		catch(NullPointerException e){
//				System.out.println(e);
				}
		finally{
			System.out.println("*** Average age of workers = "+(s/(i-2))+"\n*** workers n= "+(i-2));
		}
		
	}
	
	
	
	
	
	static void PrintWorkerData(Worker w){
		  //  maybe it will be nessesary to print data of one specific worker
		}
		
	
	

	
}

