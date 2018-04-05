import java.util.ArrayList;

public class Composite extends Component {

	private ArrayList<Component> childs = new ArrayList<Component>();
	
	
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("WORK IN PROGRESS");
	}
	
	public void addChild(Component c) {
		childs.add(c);
	}
	
	public void removeChild(Component c) throws Exception{
		childs.remove(c);
	}
	
	public void removeChild(int c) throws Exception{
		childs.remove(c);
	}
	
	public Component getChild(int i) throws Exception{
		return childs.get(i);
	}
	
	public int childssize(){
		return childs.size();
	}

	@Override
	public int getpreis() {
		// TODO Auto-generated method stub
		int gesamtkosten = 0;
		for(int i = 0;i < childs.size();i++){
			gesamtkosten += childs.get(i).getpreis();
			
		}
		return gesamtkosten;
	}
	
	

}
