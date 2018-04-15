
public class Kunde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Pizza p2 = new FamilienPizza();
		//	System.out.println(p2.beschreibung);

			Pizza p = new Diavolo(new FamilienPizza());
			System.out.println(p.preis());
	}

}
