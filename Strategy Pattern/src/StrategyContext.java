import java.util.ArrayList;

public class StrategyContext {
	
	private IStrategy strat;
	
	public void setStrat(IStrategy strat) {
		this.strat = strat;
	}
	
	public void executeStrategy(ArrayList <String> files){
		this.strat.compress(files);
	}

}
