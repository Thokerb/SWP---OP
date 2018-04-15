
public class MoveZCmd implements ICommand {

	private Figur f;
	private int meter;	
	
	public MoveZCmd(Figur f,int meter) {
		this.f = f;
		this.meter = meter;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doIt() {
		f.moveZ(meter);
		
	}

	@Override
	public void undoIt() {
		f.moveZ(-meter);
		
	}

}
