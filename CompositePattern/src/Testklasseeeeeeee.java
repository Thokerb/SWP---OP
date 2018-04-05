
public class Testklasseeeeeeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite haupt = new Composite();
		Leaf fieber = new Leaf("fiebermessen",50);
		Leaf bluat = new Leaf("blutmessen",120);

		haupt.addChild(fieber);
		haupt.addChild(new Composite());
		try {
			((Composite) haupt.getChild(haupt.childssize()-1)).addChild(fieber);
			((Composite) haupt.getChild(haupt.childssize()-1)).addChild(bluat);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(haupt.getpreis());
	}

}
