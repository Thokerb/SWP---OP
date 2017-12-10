
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heizung h1 = new Heizung();
		HeizObserver observer = new HeizObserver("Hausmeister", h1);
		HeizObserver observer2 = new HeizObserver("Direktor", h1);
		HeizObserver observer3 = new HeizObserver("Gschaftler", h1);

		h1.showBeobachter();
		h1.removeObserver(observer3);
		h1.showBeobachter();
		h1.setTemperatur(5);

	}

}
