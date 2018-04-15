import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyContext ct = new StrategyContext();
		
		//ct.setStrat(new StrategyZip());
		ct.setStrat(new StrategyRar());
		ArrayList <String> files = new ArrayList<>();
		files.add("Eine file");
		ct.executeStrategy(files);
		
	}

}
