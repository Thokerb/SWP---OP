
public class Person {
	
	private Person(){
		
	}

	private static Person instance = null;
	
	
	public static Person getInstance(){
		if(Person.instance == null){
			Person instance = new Person();
			System.out.println("neue Instanz");
		}
		else{
			System.out.println("Instanz schon vorhanden");
		}
		
		return instance;
		
	}
}
