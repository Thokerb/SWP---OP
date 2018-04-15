
public class MoveXCmd implements ICommand {

	private Figur f;
	private int meter;	
	
	public MoveXCmd(Figur f,int meter) {
		this.f = f;
		this.meter = meter;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doIt() {
		f.moveX(meter);
		
	}

	@Override
	public void undoIt() {
		f.moveX(-meter);
		
	}

}
