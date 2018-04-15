import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figur f = new Figur();
		CommandRecorder r = new CommandRecorder();
		MoveXCmd cmd = new MoveXCmd(f, 5);
		r.savecmd(cmd);
		cmd.doIt();
		
		System.out.println(f);
		cmd.undoIt();
		
		
		System.out.println(f);

	}

}
