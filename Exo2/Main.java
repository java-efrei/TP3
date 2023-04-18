public class Main {

	public static void main(String[] args){
		Chien c1 = new Chien(20, "Gilbert", "Mattéo");
		Chien c2 = new Chien(20, "Cedric", "Quentin");
		Chien c3 = new Chien(20, "Robert", "Anthony");
		Chat chat = new Chat(10, "Alex", "Bernard");

		Animal[] animals = {c1, c2, c3, chat};
		Zoo zoo = new Zoo();

		for(Animal animal : animals){
			zoo.ajout(animal);
		}

		System.out.println(zoo);


	}

}