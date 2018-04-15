
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordner o = new Ordner("Privat");
		o.addChild(new Datei(30,"adobe"));
		o.addChild(new Datei(20,"virus"));
		o.addChild(new Datei(30,"hackervirus"));
		o.removeChild(2);
		o.addChild(new Ordner("Privater3"));
		((Ordner) o.getChild(2)).addChild(new Datei(35,"avira"));
		System.out.println("Size: "+o.getSize());
		System.out.println(o.printmap());
	
	}

}
