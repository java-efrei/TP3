public class Main {

	public static void main(String[] args){
		MultipleDe m = new MultipleDe(10);
		SuperieurA s = new SuperieurA(10);
		InclusIntervalle i = new InclusIntervalle(0,10);

		Condition[] c = new Condition[3];
		c[0] = m;
		c[1] = s;
		c[2] = i;

		for(int j=0; j<c.length; j++){
			System.out.println(c[j].verif(2));
		}

	}

}