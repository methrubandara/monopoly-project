public class Railroad extends Property {
	
	//constructors
	public Railroad(int position, int x, int y, int price, int rent, String name, Player player, int mortgage) {
		super(position, x, y, price, rent, name, player, mortgage);
	}
	
	//methods
	public void changeRent(Player p) {
		int count = getOwningPlayer().getNumRail();
		if (count == 1) {
			setRent(25);
		} else if (count == 2) {
			setRent(50);
		} else if (count == 3) {
			setRent(100);
		} else if (count == 4) {
			setRent(200);
		} else {
			setRent(0);
		}
	}
}
