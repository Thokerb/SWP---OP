
public class Leaf extends Component {
	
	private String name;
	private int preis;
	
	public Leaf(String name, int preis){
		this.name = name;
		this.preis = preis;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(name+" wird ausgeführt");
	}

	@Override
	public int getpreis() {
		// TODO Auto-generated method stub
		return preis;
	}

}
