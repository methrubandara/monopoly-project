import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;

public class Monopoly {
	public static ArrayList<Player> players = new ArrayList<Player>();	
	public static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		//names
		DrawingPanel panel = new DrawingPanel(600, 600);
	    Graphics g = panel.getGraphics();
	    drawBoard(g);
		Space[] board = new Space[40];
		board[0] = new Go(0, 125 + (38*9)+8, 475);
		board[1] = new NormalProperty(1, 125 + (38*8)+7,475, 60, 2, "MEDITERRANEAN AVENUE", null, 30, "BROWN", 50, 250, 0, 0);
		board[2] = new CommunityChest(2, 125 + (38*7)+6, 475);
		board[3] = new NormalProperty(3, 125 + (38*6)+5,475, 60, 4, "BALTIC AVENUE", null, 30, "BROWN", 50, 250, 0, 0);
		board[4] = new IncomeTax(4, 125 + (38*5)+4, 475);
		board[5] = new Railroad(5, 125 + (38*4)+4, 475, 200, 25, "READING RAILROAD", null, 100);
		board[6] = new NormalProperty(6,125 + (38*3)+3,475, 100, 6, "ORIENTAL AVENUE", null, 50, "LIGHTBLUE", 50, 250, 0, 0);
		board[7] = new Chance(7,125 + (38*2)+2,475);
		board[8] = new NormalProperty(8, 125 + (38*1)+1,475,100, 6, "VERMONT AVENUE", null, 50, "LIGHTBLUE", 50, 250, 0, 0);
		board[9] = new NormalProperty(9,125 + (38*0)+0,475, 120, 8, "CONNECTICUT AVENUE", null, 60, "LIGHTBLUE", 50, 250, 0, 0);
		board[10] = new Space(10,100,125+(38*9)+8);
		board[11] = new NormalProperty(11,100,125+(38*8)+7, 140, 10, "ST. CHARLES PLACE", null, 70, "PINK", 100, 500, 0, 0);
		board[12] = new Utility(12,100,125+(38*7)+6, 150, 0, "ELECTRIC COMPANY", null, 75);
		board[13] = new NormalProperty(13,100,125+(38*6)+5, 140, 10, "STATES AVENUE", null, 70, "PINK", 100, 500, 0, 0);
		board[14] = new NormalProperty(14,100,125+(38*5)+4, 160, 12, "VIRGINIA AVENUE", null, 80, "PINK", 100, 500, 0, 0);
		board[15] = new Railroad(15,100,125+(38*4)+4, 200, 25, "PENNSYLVANIA RAILROAD", null, 100);
		board[16] = new NormalProperty(16,100,125+(38*3)+3, 180, 14, "ST. JAMES PLACE", null, 90, "ORANGE", 100, 500, 0, 0);
		board[17] = new CommunityChest(17,100,125+(38*2)+2);
		board[18] = new NormalProperty(18,100,125+(38*1)+1, 180, 14, "TENNESSEE AVENUE", null, 90, "ORANGE", 100, 500, 0, 0);
		board[19] = new NormalProperty(19,100,125+(38*0)+0, 200, 16, "NEW YORK AVENUE", null, 100, "ORANGE", 100, 500, 0, 0);
		board[20] = new Space(20, 50, 50);
		board[21] = new NormalProperty(21,125 + (38*0)+0,100, 220, 18, "KENTUCKY AVENUE", null, 110, "RED", 150, 750, 0, 0);
		board[22] = new Chance(22, 125 + (38*1)+1,100);
		board[23] = new NormalProperty(23,125 + (38*2)+2,100, 220, 18, "INDIANA AVENUE", null, 110, "RED", 150, 750, 0, 0);
		board[24] = new NormalProperty(24,125 + (38*3)+3,100, 240, 20, "ILLINOIS AVENUE", null, 120, "RED", 150, 750, 0, 0);
		board[25] = new Railroad(25,125 + (38*4)+4,100, 200, 25, "B&O RAILROAD", null, 100);
		board[26] = new NormalProperty(26,125 + (38*5)+4,100, 260, 22, "ATLANTIC AVENUE", null, 130, "YELLOW", 150, 750, 0, 0);
		board[27] = new NormalProperty(27,125 + (38*6)+5,100, 260, 22, "VENTNOR AVENUE", null, 130, "YELLOW", 150, 750, 0, 0);
		board[28] = new Utility(28,125 + (38*7)+6,100, 150, 0, "WATER WORKS", null, 75);
		board[29] = new NormalProperty(29,125 + (38*8)+7,100, 280, 24, "MARVIN GARDENS", null, 140, "YELLOW", 150, 750, 0, 0);
		board[30] = new GoToJail(30,(38*9)+8,100);
		board[31] = new NormalProperty(31,475,125+(38*0)+0, 300, 26, "PACIFIC AVENUE", null, 150, "GREEN", 200, 1000, 0, 0);
		board[32] = new NormalProperty(32,475,125+(38*1)+1, 300, 26, "NORTH CAROLINA AVENUE", null, 150, "GREEN", 200, 1000, 0, 0);
		board[33] = new CommunityChest(33,475,125+(38*2)+2);
		board[34] = new NormalProperty(34,475,125+(38*3)+3, 320, 28, "PENNSYLVANIA AVENUE", null, 160, "GREEN", 200, 1000, 0, 0);
		board[35] = new Railroad(35,475,125+(38*4)+4, 200, 25, "SHORT LINE", null, 100);
		board[36] = new Chance(36,475,125+(38*5)+4);
		board[37] = new NormalProperty(37,475,125+(38*6)+5, 350, 35, "PARK PLACE", null, 175, "DARKBLUE", 200, 1000, 0, 0);
		board[38] = new LuxuryTax(38,475,125+(38*7)+6);
		board[39] = new NormalProperty(39, 475,125+(38*8)+7, 400, 50, "BOARDWALK", null, 200, "DARKBLUE", 200, 1000, 0, 0);
		
		ArrayList<Property> available = new ArrayList<Property>();
		//brown
		available.add((Property)board[1]); //mediterranean
		available.add((Property)board[3]); //baltic
		//lightblue
		available.add((Property)board[6]);
		available.add((Property)board[8]);
		available.add((Property)board[9]);
		//pink
		available.add((Property)board[11]);
		available.add((Property)board[13]);
		available.add((Property)board[14]);
		//orange
		available.add((Property)board[16]);
		available.add((Property)board[18]);
		available.add((Property)board[19]);
		//red
		available.add((Property)board[21]);
		available.add((Property)board[23]);
		available.add((Property)board[24]);
		//yellow
		available.add((Property)board[26]);
		available.add((Property)board[27]);
		available.add((Property)board[29]);
		//green
		available.add((Property)board[31]);
		available.add((Property)board[32]);
		available.add((Property)board[34]);
		//darkblue
		available.add((Property)board[37]);
		available.add((Property)board[39]);
		//railroads
		available.add((Railroad)board[5]);
		available.add((Railroad)board[15]);
		available.add((Railroad)board[25]);
		available.add((Railroad)board[35]);
		//utilities
		available.add((Utility)board[12]);
		available.add((Utility)board[28]);
		System.out.println("Name of first player: ");
		String nameP1 = console.next();
		Player p1 = new Player(nameP1);
		System.out.println("Name of second player: ");
		String nameP2 = console.next();
		Player p2 = new Player(nameP2);
		System.out.println("Name of third player: ");
		String nameP3 = console.next();
		Player p3 = new Player(nameP3);
		System.out.println("Name of fourth player: ");
		String nameP4 = console.next();
		Player p4 = new Player(nameP4);
		players.add(p1);
		p1.setColor(Color.RED);
		players.add(p2);
		p2.setColor(Color.YELLOW);
		players.add(p3);
		p3.setColor(Color.GREEN);
		players.add(p4);
		p4.setColor(Color.BLUE);
		//rotate through array of players and take a turn for each
		int turnNum = 0;
		while (keepPlaying(players) ) {
			for (int i = 0; i<players.size(); i++) {
				if (players.get(i).getIsBankrupt()) {
					players.remove(players.get(i));
				}
			}
			if (turnNum == players.size()) {
				turnNum = 0;
			}
			if (players.get(turnNum).getIsBankrupt() != true) {
				turn(players.get(turnNum), board, p2, p3, p4, available, g);
				turnNum++;
			}
		}
	}
	
	public static boolean keepPlaying(ArrayList<Player> players) {
		int bankruptCount = 0;
		for (int i = 0; i<players.size(); i++) {
			if (players.get(i).getIsBankrupt()) {
				bankruptCount++;
			}
		}
		if (bankruptCount < 3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void turn(Player p, Space[] board, Player a, Player b, Player c, ArrayList<Property> available, Graphics g) {
		buyHousesAndHotels(p, board, a, b, c, available);
		if (p.getTurnsInJail()>0) {
			p.setTurnsInJail(p.getTurnsInJail()-1);
			if (p.getTurnsInJail() == 0) {
				p.setInJail(false);
			}
		}
		int posBefore = p.getPos();
		Color col = new Color(176, 224, 230);
		drawPlayer(p, g, board, a, b, c, col, p.getPos());
		p.roll();
		String response = "no";
			if (p.getPos()+p.getRollValue()>39) {
				p.setPos(p.getPos()+p.getRollValue()-39);
			} else {
				p.setPos(p.getPos()+p.getRollValue());
			}
			int pos = p.getPos();
			consoleDisplay(p, board);
			drawPlayer(p, g, board, a, b, c, p.getColor(), p.getPos());
			boolean onChance = board[pos] instanceof Chance;
			boolean onComChest = board[pos] instanceof CommunityChest;
			checkSpot(board, p, pos, a, b, c, available, posBefore, g);
		while (response.equals("no")) {
			if (p.getNetWorth()<=0) {
				p.setBankrupt(true);
				System.out.println(p.getName() + ", you are bankrupt.");
			}
			if (board[p.getPos()] instanceof Property && (onChance || onComChest)) {
				drawPlayer(p, g, board, a, b, c, col, p.getPos());
				checkSpot(board, p, p.getPos(), a, b, c, available, posBefore, g);
				drawPlayer(p, g, board, a, b, c,p.getColor(), p.getPos());
			}
			consoleDisplay(p, board);
			checkNegativeMoney(p, available);
			System.out.println("Are you done with your turn? ");
			response = console.next().toLowerCase();
		}
	}
	
	public static void consoleDisplay(Player p, Space[] board) {
		System.out.println();
		System.out.println();
		System.out.println(p.getName() + "'s Turn:");
		System.out.println("Balance: " + p.getMoney());
		System.out.println("Net Worth: " + p.getNetWorth());
		System.out.println("Position: " + p.getPos());
		ArrayList<Property> owned = p.getProperties();
		System.out.print(p.getName() + "'s Owned Properties: ");
		for (int i = 0; i<owned.size(); i++) {
			System.out.print(owned.get(i).getName() + ", ");
		}
		System.out.println();
		System.out.println();
		if (board[p.getPos()] instanceof Property) {
			Property prop = (Property)board[p.getPos()];
			System.out.println(p.getName() + ", you landed on " + prop.getName());
		}
	}
	
	public static void buyHousesAndHotels(Player p, Space[] board, Player a, Player b, Player c, ArrayList<Property> available) {
		if (p.ownsSet("BROWN")||p.ownsSet("LIGHTBLUE")||p.ownsSet("PINK")||p.ownsSet("ORANGE")||p.ownsSet("RED")||p.ownsSet("YELLOW")||p.ownsSet("GREEN")||p.ownsSet("DARKBLUE")) {
			boolean wantToBuyHouse = false;
			System.out.print(p.getName() + " do you want to buy a house (Type in all caps YES or NO)? ");
			String x = console.nextLine().toUpperCase();
			if (x.equals("YES")) {
				wantToBuyHouse = true;
			} else if (x.equals("NO")) {
				
			} else {
				System.out.print("INVALID");
			}
			boolean wantToBuyHotel = false;
			ArrayList<Property> owned = p.getProperties();
			for (int i = 0; i<owned.size(); i++) {
				if (owned.get(i) instanceof NormalProperty) {
					NormalProperty property = (NormalProperty)owned.get(i);
					if (property.getHouses()==4) {
						System.out.println(p.getName() + " do you want to buy a hotel (Type in all caps YES or NO)? ");
						String y = console.nextLine().toUpperCase();
						if (y.equals("YES")) {
							wantToBuyHotel = true;
						} else if (y.equals("NO")) {
							
						} else {
							System.out.println("INVALID");
						}
					}
				}
			}
			if (wantToBuyHouse) {
				System.out.println(p.getName() + " type the full name of the property in all caps (ex: \"BALTIC AVENUE\"): ");
				String prop = console.nextLine().toUpperCase();
				NormalProperty property = null;
				NormalProperty selected = null;
				for (int i = 0; i<board.length; i++) {
					if (board[i] instanceof NormalProperty) {
						property = (NormalProperty)board[i];
						if (property.getName().equals(prop)) {
							selected = property;
						}
					}
				}
				System.out.println(p.getName() + " type the number of houses you want to add (ex: \"6\"): ");
				String num = console.nextLine();
				int numberHouses = 0;
				if (num.equals("1")) {
					numberHouses = 1;
				} else if (num.equals("2")) {
					numberHouses = 2;
				} else if (num.equals("3")) {
					numberHouses = 3;
				} else if (num.equals("4")) {
					numberHouses = 4;
				} else {
					System.out.print("INVALID, NO HOUSES WILL BE BOUGHT");
				}
				p.buyHouse(selected, numberHouses);
			}
			if (wantToBuyHotel) {
				System.out.println(p.getName() + " type the full name of the property in all caps (ex: \"BALTIC AVENUE\"): ");
				String prop = console.nextLine().toUpperCase();
				NormalProperty property = null;
				NormalProperty selected = null;
				for (int i = 0; i<board.length; i++) {
					if (board[i] instanceof NormalProperty) {
						property = (NormalProperty)board[i];
						if (property.getName().equals(prop)) {
							selected = property;
						}
					}
				}
				p.buyHotel(selected);
			}
		}
	}
	
	public static void checkSpot(Space[] board, Player p, int pos, Player a, Player b, Player c, ArrayList<Property> available, int posBefore, Graphics g) {
		Color col = new Color(176, 224, 230);
		if (board[posBefore] instanceof Chance || board[posBefore] instanceof CommunityChest) {
			drawPlayer(p, g, board, a, b, c, col, pos);
		}
		if (pos<posBefore) {
			Go go = (Go)board[0];
			go.passGo(p);
		} else if (board[pos] instanceof Property) {
			onProperty(board, p, pos, available);
		} else if (board[pos] instanceof CommunityChest) {
			CommunityChest cc = (CommunityChest)board[pos];
			cc.takeCommunityChest(p, a, b, c);
		} else if (board[pos] instanceof Chance) {
			Chance chance = (Chance)board[pos];
			chance.takeChance(p, a, b, c, board);
		} else if (board[pos] instanceof GoToJail) {
			System.out.println("You landed on Go To Jail. You are now in Jail for 3 turns.");
			GoToJail gtj = (GoToJail)board[pos];
			gtj.landedOn(p);
		} else if (board[pos] instanceof IncomeTax) {
			IncomeTax it = (IncomeTax)board[pos];
			it.tax(p);
		} else if (board[pos] instanceof LuxuryTax) {
			System.out.println("You landed on Luxury Tax. You paid $75.");
			LuxuryTax lt = (LuxuryTax)board[pos];
			lt.tax(p);
		} else if (pos == 10) {
			System.out.println("You landed on Just Visiting Jail.");
		} else if (pos == 20) {
			System.out.println("You landed on Free Parking.");
		}
	}
	
	public static void onProperty(Space[] board, Player p, int pos, ArrayList<Property> available) {
		Property prop = (Property)board[pos];
		System.out.println("Price: " + prop.getPrice());
		System.out.println("Mortgage " + prop.getMortgage());
		System.out.println("Rent: " + prop.getRent());
		System.out.println();
		if (prop.getOwningPlayer() == null) {
			boolean wantToBuy = false;
			System.out.println(p.getName() + " do you want to buy this property (YES or NO)? ");
			String buy = console.next().toUpperCase();
			while (!buy.equals("YES") && !buy.equals("NO")) {
				System.out.println("INVALID, TRY AGAIN");
				buy = console.next().toUpperCase();
			}
			if (buy.equals("YES")) {
				wantToBuy = true;
			}
			if (wantToBuy == true) {
				if (p.getMoney()<prop.getPrice()) {
					System.out.println("Sorry, " + p.getName() + " you cannot afford this property"); //say they cannot afford
				} else {
					p.buyProperty(prop, available);
				}
			}
		} else if (!prop.getOwningPlayer().equals(p)) {
			if (prop instanceof Utility) {
				Utility utility = (Utility)prop;
				utility.changeRent(utility.getOwningPlayer());
			}
			if (prop instanceof Railroad) {
				Railroad railroad = (Railroad)prop;
				railroad.changeRent(railroad.getOwningPlayer());
			}
			p.payPlayer(prop.getOwningPlayer(), prop.getRent());
			System.out.println("This is " + prop.getOwningPlayer().getName() + "'s property. You pay him a rent of $" + prop.getRent() + ".");
		} else {
			System.out.println("You own this property.");
		}
	}
	
	public static void checkNegativeMoney(Player p, ArrayList<Property> available) {
		if (p.getMoney()<0) {
			boolean valid = true;
			while (valid == false) {
				System.out.println("Your balance is below 0, you must mortgage a property or sell houses/hotels. Mortgage or houses/hotels? ");
				String sell = console.next().toLowerCase();
				if (sell.contains("mortgage")) {
					mortgage(p, available);
				} else if (sell.contains("house") || sell.contains("hotel")) {
					sellBuilding(p);
				} else {
					System.out.println("INVALID");
					valid = false;
				}
			}
		}
	}
	
	public static void mortgage(Player p, ArrayList<Property> available) {
		ArrayList<Property> owned = p.getProperties();
		System.out.print("Your Owned Properties: ");
		for (int i = 0; i<owned.size(); i++) {
			System.out.print(owned.get(i).getName() + ", ");
		}
		boolean valid = true;
		while (valid == false) {
		System.out.println("Type the full name of the property: ");
		String prop = console.next().toUpperCase();
			for (int i = 0; i<owned.size(); i++) {
				if (prop.equals(owned.get(i).getName())) {
					Property property = p.getProperties().remove(owned.indexOf(owned.get(i)));
					available.add(property);
					valid = true;
					p.setMoney(p.getMoney()+property.getMortgage());
				} else if (i==owned.size()-1) {
					System.out.println("INVALID");
					valid = false;
				}
			}
		}
	}
	
	public static void sellBuilding(Player p) {
		ArrayList<Property> owned = p.getProperties();
		ArrayList<NormalProperty> ownedNorm = new ArrayList<NormalProperty>();
		for(int i = 0; i < owned.size(); i ++) {
			if(owned.get(i) instanceof NormalProperty) {
				ownedNorm.add((NormalProperty)(owned.get(i)));
				NormalProperty normal = (NormalProperty)owned.get(i);
				System.out.print(normal.getName());
				System.out.println("   Houses: " + normal.getHouses());
			}
		}
		System.out.println(p.getName() + " type the full name of the property in all caps (ex: \"BALTIC AVENUE\"): ");
		String name = console.nextLine();
		for(int i = 0; i < ownedNorm.size(); i ++) {
			if(name == ownedNorm.get(i).getName()) {
				System.out.println(p.getName() + " type the number of houses you want to sell (ex: \"6\"): ");
			int numSell = console.nextInt();
			ownedNorm.get(i).setHouses(ownedNorm.get(i).getHouses() - numSell);
			p.setMoney(p.getMoney() + numSell*ownedNorm.get(i).getHousePrice());
			}
		}
	}
	
	//graphics
	public static void drawBoard(Graphics g) {
		Color brown = new Color(210,105,30);
        Color lightBlue = new Color(173,200,230);
        Color c = new Color(176, 224, 230);
        g.setColor(c);
        g.fillRect(51, 51, 500, 500);
        g.setColor(Color.BLACK);
        g.drawRect(125,125,350,350);
        g.drawRect(50, 50, 500, 500);
        g.setColor(brown);
        g.fillRect(125 + (38*6)+5,475,39,25);
        g.fillRect(125 + (38*8)+7,475,39,25);
        g.setColor(lightBlue);
        g.fillRect(125 + (38*0)+0,475,39,25);
        g.fillRect(125 + (38*1)+1,475,39,25);
        g.fillRect(125 + (38*3)+3,475,39,25);
        g.setColor(Color.PINK);
        g.fillRect(100,125+(38*5)+4,25,39);
        g.fillRect(100,125+(38*6)+5,25,39);
        g.fillRect(100,125+(38*8)+7,25,39);
        g.setColor(Color.ORANGE);
        g.fillRect(100,125+(38*0)+0,25,39);
        g.fillRect(100,125+(38*1)+1,25,39);
        g.fillRect(100,125+(38*3)+3,25,39);
        g.setColor(Color.RED);
        g.fillRect(125 + (38*0)+0,100,39,25);
        g.fillRect(125 + (38*2)+2,100,39,25);
        g.fillRect(125 + (38*3)+3,100,39,25);
        g.setColor(Color.YELLOW);
        g.fillRect(125 + (38*5)+4,100,39,25);
        g.fillRect(125 + (38*6)+5,100,39,25);
        g.fillRect(125 + (38*8)+7,100,39,25);
        g.setColor(Color.GREEN);
        g.fillRect(475,125+(38*0)+0,25,39);
        g.fillRect(475,125+(38*1)+1,25,39);
        g.fillRect(475,125+(38*3)+3,25,39);
        g.setColor(Color.BLUE);
        g.fillRect(475,125+(38*6)+5,25,39);
        g.fillRect(475,125+(38*8)+7,25,39);
        g.setColor(Color.BLACK);
        g.drawLine(125 + (0*38) + 0,50,125 + (0*38) + 0,125);
        g.drawLine(125 + (1*38) + 1,50,125 + (1*38) + 1,125);
        g.drawLine(125 + (2*38) + 2,50,125 + (2*38) + 2,125);
        g.drawLine(125 + (3*38) + 3,50,125 + (3*38) + 3,125);
        g.drawLine(125 + (4*38) + 4,50,125 + (4*38) + 4,125);
        g.drawLine(125 + (5*38) + 4,50,125 + (5*38) + 4,125);
        g.drawLine(125 + (6*38) + 5,50,125 + (6*38) + 5,125);
        g.drawLine(125 + (7*38) + 6,50,125 + (7*38) + 6,125);
        g.drawLine(125 + (8*38) + 7,50,125 + (8*38) + 7,125);
        g.drawLine(125 + (9*38) + 8,50,125 + (9*38) + 8,125);  
        g.drawLine(50,125 + (0*38) + 0,125,125 + (0*38) + 0);
        g.drawLine(50,125 + (1*38) + 1,125,125 + (1*38) + 1);
        g.drawLine(50,125 + (2*38) + 2,125,125 + (2*38) + 2);
        g.drawLine(50,125 + (3*38) + 3,125,125 + (3*38) + 3);
        g.drawLine(50,125 + (4*38) + 4,125,125 + (4*38) + 4);
        g.drawLine(50,125 + (5*38) + 4,125,125 + (5*38) + 4);
        g.drawLine(50,125 + (6*38) + 5,125,125 + (6*38) + 5);
        g.drawLine(50,125 + (7*38) + 6,125,125 + (7*38) + 6);
        g.drawLine(50,125 + (8*38) + 7,125,125 + (8*38) + 7);
        g.drawLine(50,125 + (9*38) + 8,125,125 + (9*38) + 8);
        g.drawLine(125 + (0*38) + 0,475,125 + (0*38) + 0,550);
        g.drawLine(125 + (1*38) + 1,475,125 + (1*38) + 1,550);
        g.drawLine(125 + (2*38) + 2,475,125 + (2*38) + 2,550);
        g.drawLine(125 + (3*38) + 3,475,125 + (3*38) + 3,550);
        g.drawLine(125 + (4*38) + 4,475,125 + (4*38) + 4,550);
        g.drawLine(125 + (5*38) + 4,475,125 + (5*38) + 4,550);
        g.drawLine(125 + (6*38) + 5,475,125 + (6*38) + 5,550);
        g.drawLine(125 + (7*38) + 6,475,125 + (7*38) + 6,550);
        g.drawLine(125 + (8*38) + 7,475,125 + (8*38) + 7,550);
        g.drawLine(125 + (9*38) + 8,475,125 + (9*38) + 8,550);  
        g.drawLine(475,125 + (0*38) + 0,550,125 + (0*38) + 0);
        g.drawLine(475,125 + (1*38) + 1,550,125 + (1*38) + 1);
        g.drawLine(475,125 + (2*38) + 2,550,125 + (2*38) + 2);
        g.drawLine(475,125 + (3*38) + 3,550,125 + (3*38) + 3);
        g.drawLine(475,125 + (4*38) + 4,550,125 + (4*38) + 4);
        g.drawLine(475,125 + (5*38) + 4,550,125 + (5*38) + 4);
        g.drawLine(475,125 + (6*38) + 5,550,125 + (6*38) + 5);
        g.drawLine(475,125 + (7*38) + 6,550,125 + (7*38) + 6);
        g.drawLine(475,125 + (8*38) + 7,550,125 + (8*38) + 7);
        g.drawLine(475,125 + (9*38) + 8,550,125 + (9*38) + 8);
        g.drawLine(125 + (38*0)+0,100,125 + (38*1)+1,100);
        g.drawLine(125 + (38*2)+2,100,125 + (38*3)+3,100);
        g.drawLine(125 + (38*3)+3,100,125 + (38*4)+4,100);
        g.drawLine(125 + (38*5)+4,100,125 + (38*6)+5,100);
        g.drawLine(125 + (38*6)+5,100,125 + (38*7)+6,100);
        g.drawLine(125 + (38*8)+7,100,125 + (38*9)+8,100);
        g.drawLine(500,125+(38*0)+0,500,125+(38*1)+1);
        g.drawLine(500,125+(38*1)+1,500,125+(38*2)+2);
        g.drawLine(500,125+(38*3)+3,500,125+(38*4)+4);
        g.drawLine(500,125+(38*6)+5,500,125+(38*7)+6);
        g.drawLine(500,125+(38*8)+7,500,125+(38*9)+8);
        g.drawLine(100,125+(38*0)+0,100,125+(38*1)+1);
        g.drawLine(100,125+(38*1)+1,100,125+(38*2)+2);
        g.drawLine(100,125+(38*3)+3,100,125+(38*4)+4);
        g.drawLine(100,125+(38*5)+4,100,125+(38*6)+5);
        g.drawLine(100,125+(38*6)+5,100,125+(38*7)+6);
        g.drawLine(100,125+(38*8)+7,100,125+(38*9)+8);
        g.drawLine(125 + (38*0)+0,500,125 + (38*1)+1,500);
        g.drawLine(125 + (38*1)+1,500,125 + (38*2)+2,500);
        g.drawLine(125 + (38*3)+3,500,125 + (38*4)+4,500);
        g.drawLine(125 + (38*6)+5,500,125 + (38*7)+6,500);
        g.drawLine(125 + (38*8)+7,500,125 + (38*9)+8,500);
        g.drawLine(50, 475, 500, 475);
        g.drawLine(475, 125, 475, 475);
	}
	public static void drawPlayer(Player p, Graphics g, Space[] board, Player a, Player b, Player c, Color color, int pos) {
		g.setColor(color);
		Space spot = board[pos];
		if (p.getPos()<10) {
			g.fillRect(spot.getxCord()+15, spot.getyCord()+35, 10, 10);
		} else if (p.getPos() > 10 && p.getPos()<20) {
			g.fillRect(spot.getxCord()-30, spot.getyCord()+15, 10, 10);
		} else if (p.getPos() > 20 && p.getPos()<30) {
			g.fillRect(spot.getxCord()+15, spot.getyCord()-35, 10, 10);
		} else if (p.getPos() > 30 && p.getPos()<40) {
			g.fillRect(spot.getxCord()+35, spot.getyCord()+15, 10, 10);
		} else if (p.getPos() == 10) {
			g.fillRect(spot.getxCord()-35, spot.getyCord()+15, 10, 10);
		} else if (p.getPos() == 20) {
			g.fillRect(spot.getxCord()+15, spot.getyCord()+15, 10, 10);
		} else if (p.getPos() == 30) {
			g.fillRect(spot.getxCord()+15, spot.getyCord()-35, 10, 10);
		} else if (p.getPos() == 0) {
			g.fillRect(spot.getxCord()+15, spot.getyCord()+15, 10, 10);
		}
		
		for (int i = 0; i<board.length; i++) {
			if (board[i] instanceof Property) {
				Property prop = (Property)board[i];
				if (prop.getOwningPlayer() != null) {
					g.setColor(prop.getOwningPlayer().getColor());
					if (i<10) {
						g.drawRect(prop.getxCord()+5, prop.getyCord()+5, 40-12, 75-10);
					} else if (i<20 && i>10) {
						g.drawRect(prop.getxCord()-50+5, prop.getyCord()+5, 75-12, 40-10);
					} else if (i>20 && i<30) {
						g.drawRect(prop.getxCord()+5, prop.getyCord()-50+5, 40-12, 75-10);
					} else if (i>30 && i<40) {
						g.drawRect(prop.getxCord()+5, prop.getyCord()+5, 75-12, 40-10);
					}
				}
			}
		}
	}
}