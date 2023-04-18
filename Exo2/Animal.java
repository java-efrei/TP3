public abstract class Animal {

	protected int poids;
	protected String nom;

	public Animal(int p, String n){
		this.poids = p;
		this.nom = n;
	}

	public int getPoids(){
		return this.poids;
	}
	public String getName(){
		return this.nom;
	}
	public void setPoids(int p){
		this.poids = p;
	}
	public void setName(String n){
		this.nom = n;
	}

	@Override
	public String toString(){
		return("Nom : " + this.nom + "\nPoids : " + this.poids);
	}

	public abstract void manger(String aliment);

}