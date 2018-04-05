
public class Factory {
	public static IPizza makePizza(String pizza) throws Exception{
		switch(pizza){
		case "salami":{
			
			return new Salami();
		}
		
		case "schinken":{
			
			return new Schinken();
		}
		
		case "diavolo":{

			return new Diavolo();
		}
		
		default:{
			throw new Exception();
		}
		}
	}
	
	
}
