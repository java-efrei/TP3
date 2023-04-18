import java.util.ArrayList;

public class Zoo {

	ArrayList<Animal> animals;

	public Zoo(){
		this.animals = new ArrayList<Animal>(20);
	}

	public void ajout(Animal a){
		this.animals.add(a);
	}

	@Override
	public String toString(){
		String r = "";
		for(Animal animal : this.animals){
			r += animal.getName() + "\n";
		}
		return r;
	}

}