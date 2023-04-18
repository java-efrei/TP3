public class MultipleDe  implements Condition {

	private int n;

	public MultipleDe(int n){
		this.n = n;
	}

	@Override
	public boolean verif(int x){
		return (this.n % x == 0);
	}

	@Override
	public String toString(){
		return("(Multiple de " + n + ")");
	}

}