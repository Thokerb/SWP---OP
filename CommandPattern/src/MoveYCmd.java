
public class MoveYCmd implements ICommand {

	private Figur f;
	private int meter;	
	
	public MoveYCmd(Figur f,int meter) {
		this.f = f;
		this.meter = meter;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doIt() {
		f.moveY(meter);
		
	}

	@Override
	public void undoIt() {
		f.moveY(-meter);
		
	}

}
