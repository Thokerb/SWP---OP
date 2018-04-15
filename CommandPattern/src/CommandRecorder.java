import java.util.Stack;

public class CommandRecorder {
	Stack sthaupt = new Stack();
	Stack stneben = new Stack();

	public void execute(ICommand cmd){
		cmd.doIt();
		sthaupt.push(cmd);
	}
	
	public void doschritt(){
		
	}
	
	public void undoschritt(){
		
	}


}
