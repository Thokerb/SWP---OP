
public class Figur {
	int posX;
	int posY;
	int posZ;
	
	public Figur(){
		this.posX = 0;
		this.posY = 0;
		this.posZ = 0;
	}
	
	public void moveX(int meter){
		this.posX += meter;
	}
	
	public void moveY(int meter){
		this.posY += meter;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X:"+posX+" Y:"+posY+" Z:"+posZ;
	}
	
	public void moveZ(int meter){
		this.posZ += meter;
	}
	
	
}
