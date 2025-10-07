public class Utility extends Property{
	
	//constructors
	public Utility(int position, int x, int y, int price, int rent, String name, Player player, int mortgage) {
		super(position, x, y, price, rent, name, player, mortgage);
	}
	
	//methods
	public void changeRent(Player p) {
		int count = getOwningPlayer().getNumUtil();
		if (count == 1) {
			setRent(4*(p.getRollValue()));
		} else if (count == 2) {
			setRent(10*(p.getRollValue()));
		} else {
			setRent(0);
		}
	}
	public void chargeRent(Player p) {
		p.setMoney(p.getMoney()-getRent());
	}
}
