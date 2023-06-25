package exercise2;

public class DogUse {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Tommy", "Bulldog");
		Dog dog2 = new Dog("Tiger", "Golden Retriver");
		
		System.out.println("DETAILS OF DOGS BEFORE CHANGE");
		System.out.println("	Dog1 Name: "+dog1.getName()+ " and Dog1 breed: "+dog1.getBreed());
		System.out.println("	Dog2 Name: "+dog2.getName()+ " and Dog2 breed: "+dog2.getBreed());
		
		System.out.println(); //For giving one line gap
		
		//Changing the name of Dog1 and Breed of Dog2
		dog1.setName("Max");
		dog2.setBreed("Dalmation");
		
		System.out.println("DETAILS OF DOGS AFTER CHANGE");
		System.out.println("	Dog1 Name: "+dog1.getName()+ " and Dog1 breed: "+dog1.getBreed());
		System.out.println("	Dog2 Name: "+dog2.getName()+ " and Dog2 breed: "+dog2.getBreed());
		

	}

}
