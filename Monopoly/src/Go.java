public class Go extends Space {
	public Go(int pos, int x, int y) {
		super(pos, x, y);
	}
	
	public void passGo(Player p) {
		p.setMoney(p.getMoney()+200);
	}
}
