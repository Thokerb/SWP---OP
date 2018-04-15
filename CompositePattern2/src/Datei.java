
public class Datei extends Struktur {
	private int  size;
	private String name;
	public Datei(int size,String name){
		this.size = size;
		this.name = name;
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public String printmap() {
		// TODO Auto-generated method stub
		return "\t"+this.name;
	}
}
