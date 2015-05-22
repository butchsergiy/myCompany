package com.edvantis.training.java.dataOp;

import java.io.IOException;

import com.edvantis.training.java.model.Worker;


public interface OperationsInterface {
	
	public static Worker[] 	loadData				(String file)throws IOException {return null; }
	
	public static void 		AddWorker				(String file, String data){}	
	
	public void 			PrintAllFile			(String file) throws IOException;
	
	public static 			String enterNewWorker	() {return null;}	
	
	public static void 		getSumSellary			(Worker[] w) {}
	
	public static void 		getSumSellaryWB			(Worker[] w) {}
	
	public void 			printAllSurnames		(Worker[] w);
	
	public void 			findAverageAge			(Worker[] w);
	
	static void 			PrintWorkerData			(Worker w) {}  		// do not implemented. Seems I dont need this method  @#@#@#@@#

}
