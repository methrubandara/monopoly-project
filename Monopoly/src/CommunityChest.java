public class CommunityChest extends Action {
	public CommunityChest(int position, int x, int y) {
		super(position, x, y);
	}
	
	public void takeCommunityChest(Player p, Player a, Player b, Player c) {
		System.out.println("You landed on a Community Chest! ");
		int random = (int)(Math.random()*17+1);
		if (random == 1) {
			System.out.println("Advance to go.");
			p.setPos(0);
		} else if (random == 2) {
			System.out.println("Bank error in your favor. Collect $200.");
			p.setMoney(p.getMoney()+200);
		} else if (random == 3) {
			System.out.println("Doctor's fee. Pay $50.");
			p.setMoney(p.getMoney()-50);
		} else if (random == 4) {
			System.out.println("From sale of stock. Collect $50.");
			p.setMoney(p.getMoney()+50);
		} else if (random == 5) {
			System.out.println("This Community Chest does nothing.");
		} else if (random == 6) {
			System.out.println("Go to Jail. Go directly to Jail.");
			p.setPos(10);
			p.setInJail(true);
		} else if (random == 7) {
			System.out.println("Grand Opera. Each player pays you $50.");
			a.payPlayer(p, 50);
			b.payPlayer(p, 50);
			c.payPlayer(p, 50);
		} else if (random == 8) {
			System.out.println("Holiday fund matures. Collect $100.");
			p.setMoney(p.getMoney()+100);
		} else if (random == 9) {
			System.out.println("Income tax refund. Collect $20.");
			p.setMoney(p.getMoney()+20);
		} else if (random == 10) {
			System.out.println("It's your birthday. Collect $10.");
			p.setMoney(p.getMoney()+10);
		} else if (random == 11) {
			System.out.println("Life insurance matures. Collect 100.");
			p.setMoney(p.getMoney()+100);
		} else if (random == 12) {
			System.out.println("Pay hospital fees. Pay $100.");
			p.setMoney(p.getMoney()-100);
		} else if (random == 13) {
			System.out.println("Pay school fees. Pay $150.");
			p.setMoney(p.getMoney()-150);
		} else if (random == 14) {
			System.out.println("Receive $25 consultancy fee.");
			p.setMoney(p.getMoney()+25);
		} else if (random == 15) {
			System.out.println("Street repairs. You pay $40 per house and $115 per hotel.");
			int numHouses = 0;
			int numHotels = 0;
			for (int i = 0; i<p.getProperties().size(); i++) {
				if(p.getProperties().get(i) instanceof NormalProperty) {
					NormalProperty temp = (NormalProperty)(p.getProperties().get(i));
					numHouses = temp.getHouses();
					numHotels = temp.getHotels();
				}
			}
			int cost = 0;
			cost = numHouses*40 + numHotels*115;
			p.setMoney(p.getMoney()-cost);
		} else if (random == 16) {
			System.out.println("You win second in a beauty prize contest. Collect $10.");
			p.setMoney(p.getMoney()+10);
		} else if (random == 17) {
			System.out.println("You inherit 100.");
			p.setMoney(p.getMoney()+100);
		}
	}
}
