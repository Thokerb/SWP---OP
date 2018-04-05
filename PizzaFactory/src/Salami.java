
public class Salami implements IPizza {

	private String[] Zutaten = new String[3];

	
	@Override
	public void zubereiten() {
		// TODO Auto-generated method stub
		System.out.println("Juhuu, die Pizza ist fertig");
		Zutaten[0] = "Käse";
		Zutaten[1] = "Salami";
		Zutaten[2] = "mehr Salami";


	}

	@Override
	public void getZutaten() {
		// TODO Auto-generated method stub
		for(int i=0;i<= Zutaten.length-1;i++){
			System.out.println(Zutaten[i]);
		}
	}
	
}
