package exercise8;

public class Main {

	public static void main(String[] args) {
		
		
		//Create Traffic Light
		TrafficLight light = new TrafficLight("red", 30);
		
		//Checking colors of light
		System.out.println("=========CHECKING TRAFFIC LIGHT STATUS==========");
		System.out.println("Is this red: " + light.isRed());
		System.out.println("Is thid green: " + light.isGreen());
		System.out.println("Current status of TrafficLight: " + light.getColor() + " signal for " + light.getDuration() + " second");
		System.out.println();
		
		//Changing Traffic Light color and changing duration
		light.changeColor("green");
		light.setDuration(20);
		
		//Checking light color after it got changed
		System.out.println("=========CHECKING TRAFFIC LIGHT STATUS==========");
		System.out.println("Is this red: " + light.isRed());
		System.out.println("Is thid green: " + light.isGreen());
		System.out.println("Current status of TrafficLight: " + light.getColor() + " signal for " + light.getDuration() + " second");
		System.out.println();
		
		
		
	}

}
