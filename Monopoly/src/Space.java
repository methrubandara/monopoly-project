public class Space {
	private int position;
	private int xCord;
	private int yCord;
	
	//constructors
	public Space() {
		position = 0;
		xCord = 0;
		yCord = 0;
	}
	public Space(int pos, int xCord, int yCord) {
		position = pos;
		this.xCord = xCord;
		this.yCord = yCord;
	}
	
	//setters and getters
	public int getPosition() {
		return position;
	}
	public void setPosition(int pos) {
		position = pos;
	}
	public int getxCord() {
		return xCord;
	}
	public void setxCord(int xCord) {
		this.xCord = xCord;
	}
	public int getyCord() {
		return yCord;
	}
	public void setyCord(int yCord) {
		this.yCord = yCord;
	}
	
}
