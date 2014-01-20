package pattern.factory;

public class AppDemo {

	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
		animal.speak();
		animal.eat();
	}
		
}
	