public class SuperieurA implements Condition {

	private int ref;

	public SuperieurA(int r){
		this.ref = r;
	}

	@Override
	public boolean verif(int x){
		return x > this.ref;
	}

	@Override
	public String toString(){
		return "(SuperieurA " + " > " + ref + ")";
	}

}