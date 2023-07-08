package exercise12;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		//Creating 3 flights
		Airplane flight1 = new Airplane("IG101","Delhi", LocalTime.of(10, 30) );
		Airplane flight2 = new Airplane("IG102","Bengaluru", LocalTime.of(11, 00) );
		Airplane flight3 = new Airplane("IG103","London", LocalTime.of(11, 30) );

		//Checking flight status
		System.out.println("========FLIGHT STATUS=========");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
		System.out.println();

		//Creating delay in flight 1 and flight 3
		flight1.delay(20);
		flight3.delay(50);

		//Checking flight status after creating delay
		System.out.println("=====FLIGHT STATUS AFTER CREATING DELAY======");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
	}

}
