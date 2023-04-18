public class InclusIntervalle implements Condition {

	private int a;
	private int b;

	public InclusIntervalle(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean verif(int x){
		return x >= this.a && x < this.b;
	}

	@Override
	public String toString() {
		return "(InclusIntervalle [" + a + "," + b + "[)";
	}

}