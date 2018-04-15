
public class Diavolo extends PizzaDecorator {

	public Diavolo(Pizza p) {
		this.p = p;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int preis() {
		// TODO Auto-generated method stub
		return this.p.preis() + 2;
	}

}
