public class LuxuryTax extends Space {
	public LuxuryTax(int pos, int x, int y) {
		super(pos, x, y);
	}
	
	public void tax(Player p) {
		p.setMoney(p.getMoney()-75);
	}
}

