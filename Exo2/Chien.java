public class Chien extends Animal {

	String maitre;

	public Chien(int poids, String nom, String maitre){
		super(poids, nom);
		this.maitre = maitre;
	}

	public String getMaitre(){
		return this.maitre;
	}
	public void setMaitre(String m){
		this.maitre = m;
	}

	@Override
	public String toString(){
		return("Nom : " + super.nom + "\nPoids : " + super.poids + "\nMaître : " + this.maitre);
	}

	@Override
	public void manger(String aliment){
		System.out.println("Le chien mange du " + aliment);
	}

}