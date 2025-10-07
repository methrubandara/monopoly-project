public class Chance extends Action {
	
	public Chance(int position, int x, int y) {
		super(position, x, y);
	}
	
	//methods
	public void takeChance(Player p, Player a, Player b, Player c, Space[] board) {
		System.out.println("You landed on a Chance! ");
		int random = (int)(Math.random()*16+1);
		if (random == 1) {
			System.out.println("Advance to go.");
			p.setPos(0);
		} else if (random == 2) {
			System.out.println("Advance to illinois ave, if you pass go collect $200.");
			if (p.getPos()>=24) {
				p.setMoney(p.getMoney()+200);
			}
			p.setPos(24);
		} else if (random == 3) {
			System.out.println("Advance to St Charles Place, if you pass go collect $200");
			if (p.getPos()>=11) {
				p.setMoney(p.getMoney()+200);
			}
			p.setPos(11);
		} else if (random == 4) {
			System.out.println("Advance to nearest utility, and pay owner 10 times the amount rolled. You had rolled a " + p.getRollValue() + ".");
			if (p.getPos()>=28) {
				p.setMoney(p.getMoney()+200);
			}
			if (p.getPos()>=12 && p.getPos()<28) {
				p.setPos(28);
				Utility utility = (Utility)board[28];
				int amount = 10*p.getRollValue();
				if (utility.getOwningPlayer() != null) {
					p.payPlayer(utility.getOwningPlayer(), amount);
				}
			} else {
				p.setPos(12);
				Utility utility2 = (Utility)board[12];
				int amount2 = 10*p.getRollValue();
				if (utility2.getOwningPlayer() != null) {
					p.payPlayer(utility2.getOwningPlayer(), amount2);
				}
			}
		} else if (random == 5) {
			System.out.println("Advance to nearest railroad. Pay owner 2 times the rent.");
			if (p.getPos()>=35) {
				p.setPos(p.getPos()+200);
			}
			if (p.getPos()>=35 || p.getPos()<5) {
				p.setPos(5);
				Railroad r1 = (Railroad)board[5];
				int a1 = 2*r1.getRent();
				if (r1.getOwningPlayer() != null) {
					p.payPlayer(r1.getOwningPlayer(), a1);
				}
			} else if (p.getPos()>=5 || p.getPos()<15) {
				p.setPos(15);
				Railroad r2 = (Railroad)board[15];
				int a2 = 2*r2.getRent();
				if (r2.getOwningPlayer() != null) {
					p.payPlayer(r2.getOwningPlayer(), a2);
				}
			} else if (p.getPos()>=15 || p.getPos()<25) {
				p.setPos(25);
				Railroad r3 = (Railroad)board[25];
				int a3 = 2*r3.getRent();
				if (r3.getOwningPlayer() != null) {
					p.payPlayer(r3.getOwningPlayer(), a3);
				}
			} else {
				p.setPos(35);
				Railroad r4 = (Railroad)board[35];
				int a4 = 2*r4.getRent();
				if (r4.getOwningPlayer() != null) { 
				p.payPlayer(r4.getOwningPlayer(), a4);
				}
			}
		} else if (random == 6) {
			System.out.println("Bank pays you a dividend of $50.");
			p.setMoney(p.getMoney()+50);
		} else if (random == 7) {
			System.out.println("This Chance does nothing.");
		} else if (random == 8) {
			System.out.println("Go back 3 spaces.");
			if (p.getPos()==2) {
				p.setPos(39);
			} else if (p.getPos()==1) {
				p.setPos(38);
			} else if (p.getPos()==0) {
				p.setPos(37);
			} else {
				p.setPos(p.getPos()-3);
			}
		} else if (random == 9) {
			System.out.println("Go to Jail. Go directly to Jail.");
			p.setPos(10);
			p.setInJail(true);
		} else if (random == 10) {
			System.out.println("Street repairs. You pay $25 per house and $100 per hotel.");
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
			cost = numHouses*25 + numHotels*100;
			p.setMoney(p.getMoney()-cost);
		} else if (random == 11) {
			System.out.println("Pay poor tax. Pay $15.");
			p.setMoney(p.getMoney()-15);
		} else if (random == 12) {
			System.out.println("Take a ride on the Reading.");
						if (p.getPos()<5) {
							p.setPos(5);
						} else {
							p.setPos(5);
							p.setMoney(p.getMoney()+200);
						}
		} else if (random == 13) {
			System.out.println("Take a walk on the Boardwalk.");
			if (p.getPos() == 39) {
				p.setMoney(p.getMoney()+200);
			}
			p.setPos(39);
		} else if (random == 14) {
			System.out.println("You are elected chairman of the board. Pay each player $50.");
			p.payPlayer(a, 50);
			p.payPlayer(b, 50);
			p.payPlayer(c, 50);
		} else if (random == 15) {
			System.out.println("Building and loan matures. Collect $150.");
			p.setMoney(p.getMoney()+150);
		} else if (random == 16) {
			System.out.println("You won a crossword competition. Collect $100.");
			p.setMoney(p.getMoney()+100);
		}
	}
	
}
