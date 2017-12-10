import java.util.ArrayList;

public class Heizung {
	
	ArrayList <HeizObserver> Beobachter = new ArrayList<>();
	private int Temperatur;
	
	public void addObserver(HeizObserver observer){
		Beobachter.add(observer);
	
	}
	
	public void removeObserver(HeizObserver observer){
		if(Beobachter.contains(observer))System.out.println("Observer vorhanden");
		else System.out.println("Observer nicht vorhanden");
		
		Beobachter.remove(observer);
		
	}
	
	public void benachrichtigen(){
		for(int i = 0;i< Beobachter.size();i++){
			Beobachter.get(i).update();
		}
	}
	
	public void showBeobachter(){
		System.out.println("---------------------------");
		System.out.println("Liste mit allen Beobachtern:");
		for(int i = 0;i< Beobachter.size();i++){
			System.out.println(Beobachter.get(i).getName());
		}
		System.out.println("---------------------------");
	}

	public int getTemperatur() {
		return Temperatur;
	}

	public void setTemperatur(int temperatur) {
		Temperatur = temperatur;
		benachrichtigen();
		
	}

}
