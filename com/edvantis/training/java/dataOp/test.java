package com.edvantis.training.java.dataOp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;



public class test {

	public static void main(String[] args) {

		String a="";
		
//		if(a.matches("[a-zA-Z~!@#$%^&*()_+=-]*")) System.out.println("11111111");
//		else System.out.println(" 22 !!!digits!!! ");
		
		
		if(a.matches("[0-9]*")) System.out.println("digitsss");
		else System.out.println(" there is a letter ");
		
		
		// Display a time value.
		 System.out.println("\nLocal Values");
		 System.out.println("Local Time: "
		 + LocalTime.now().toString());
		 // Display a date value.
		 System.out.println("Local Date: "
		 + LocalDate.now().toString());
		 // Display both the time and the date.
		 System.out.println("Local Date and Time: "
		 + LocalDateTime.now().toString());
		
		 
		 
//////////////////////////////////////////////////////////////////////////////// сортування масиву працює але спочатку йдуть усі
		 // великі букви а потім малі. 
		 
	System.out.println("\n\n");
		 
		 String [] mas=new String[8];
		 mas[1]="Klimko volodymyr                        ";
		 mas[2]="Prosolov volodymyr                      ";
		 mas[3]="Kiyovskyy olecsandr olecsandrovich      ";
		 mas[4]="Buch sergiy volodimirovich              ";
		 mas[5]="Kaninskyy Oleksandr                     ";
		 mas[6]="Shcherbak Vyacheslav                    ";
		 mas[7]="ATratata Vadim Vasilovich   ";
		 

		 for(String d: mas) System.out.println(d);
		 
		 
		 Arrays.sort(mas,1,8);
		System.out.println("\n\n");	 
		 
		 for (int i=1;i< mas.length; i++) System.out.println(mas[i]);
//////////////////////////////////////////////////////////////////////////////////////////		 
		
		 ArrayList<String> arl=new ArrayList<String>();
		 arl.add("Klimko volodymyr");
		 arl.add("Prosolov volodymyr");
		 arl.add("Kiyovskyy olecsandr olecsandrovich");
		 arl.add("Buch sergiy volodimirovich");
		 arl.add("Kaninskyy Oleksandr");
		 arl.add("Shcherbak Vyacheslav");
		 arl.add("ATratata Vadim Vasilovich");
		 
		 
		 
		 
		 
		 
		 
	}

}
