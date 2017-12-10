
public class HeizObserver {
	private String name;
	
	private Heizung Ziel;
	
	public HeizObserver(String name,Heizung h1){
		Ziel = h1;
		setName(name);
		
		Ziel.addObserver(this);
	}
	
	public void update(){
		
		System.out.println(name+" hat die Temperatur erfahren. Es ist "+Ziel.getTemperatur()+" Grad warm");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
