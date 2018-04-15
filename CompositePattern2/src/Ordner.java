import java.util.ArrayList;

public class Ordner extends Struktur {

	ArrayList<Struktur> kids = new ArrayList<Struktur>();
	private String name;
	
	public Ordner(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void addChild(Struktur str){
		kids.add(str);
	}
	
	public Struktur getChild(int i) throws IndexOutOfBoundsException{
		return kids.get(i);
	}
	
	public void removeChild(int i) throws IndexOutOfBoundsException{
		kids.remove(i);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0;i < kids.size();i++){
			count = count + kids.get(i).getSize();
		}
		return count;
	}
	
	public String printmap(){
		String map = name+"\n";
		for(int i = 0;i < kids.size();i++){
			map += kids.get(i).printmap()+"\n";
		}
		return map+"\n";

	}
}
