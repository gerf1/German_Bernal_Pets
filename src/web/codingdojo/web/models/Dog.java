package web.codingdojo.web.models;


public class Dog extends Animal{
	
	public Dog(String name, String breed, Double weight) {
		super(name, breed, weight);
	}

	public String showAffection() {
		
		if(this.weight<30) {
			return this.name+" hops on your lap";
		}
		else{
			return this.name+" curled up next to you";
		}
		
	}
}