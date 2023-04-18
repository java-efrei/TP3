public class Chat extends Animal {

	String race;

	public Chat(int p, String nom, String r){
		super(p, nom);
		this.race = r;
	}

	public String getRace(){
		return this.race;
	}
	public void setRace(String r){
		this.race = r;
	}

	@Override
	public String toString(){
		return("Nom : " + super.nom + "\nPoids : " + super.poids + "\nRace : " + this.race);
	}

	@Override
	public void manger(String aliment){
		System.out.println("Le chat mange du " + aliment);
	}

}