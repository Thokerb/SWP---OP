
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IPizza p = Factory.makePizza("salami");
			p.zubereiten();
			p.getZutaten();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
