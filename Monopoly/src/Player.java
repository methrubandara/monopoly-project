import java.util.ArrayList;
import java.awt.Color;
public class Player {
	//instance variables
	private String name;
	private int money; 
	private ArrayList<Property> properties; 
	private int position;
	private boolean inJail;
	private boolean isBankrupt;
	private int rollValue;
	private int numRail;
	private int numUtil;
	private int turnsInJail;
	private int xCoord;
	private int yCoord;
	private Color color;
	
	//constructors
	public Player(String name) {
		this.name = name;
		money = 1500;
		properties = new ArrayList<Property>(); //make it a empty array list
		position = 0;
		inJail = false;
		isBankrupt = false;
		rollValue = 0;
		numRail = 0;
		turnsInJail = 0;
		xCoord = 125 + (38*9)+85;
		yCoord = 47;
		color = null;
	}
	
	public Player(String name, int money, ArrayList<Property> properties, int position, boolean inJail, boolean isBankrupt, int rollValue, int numRail, int numUtil, int turnsInJail, int x, int y) {
		this.name = name;
		this.money = money;
		this.properties = properties; //make it a empty array list
		this.position = position;
		this.inJail = inJail;
		this.isBankrupt = isBankrupt;
		this.rollValue = rollValue;
		this.numRail = numRail;
		this.numUtil = numUtil;
		this.turnsInJail = turnsInJail;
		xCoord = x;
		yCoord = y;
		
	}

	//setters and getters
	
	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public ArrayList<Property> getProperties() {
		return properties;
	}
	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}
	
	public int getPos() {
		return position;
	}
	public void setPos(int pos) {
		position = pos;
	}
	
	public boolean getInJail() {
		return inJail;
	}
	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}
	
	public boolean getIsBankrupt() {
		return isBankrupt;
	}
	public void setIsBankrupt(boolean isBankrupt) {
		this.isBankrupt = isBankrupt;
	}
	
	public int getRollValue() {
		return rollValue;
	}
	public void setRollValue(int rollValue) {
		this.rollValue = rollValue;
	}
	
	public int getNumRail() {
		return numRail;
	}
	public void setNumRail(int numRail) {
		this.numRail = numRail;
	}
	
	public int getNumUtil() {
		return numUtil;
	}
	public void setNumUtil(int numUtil) {
		this.numUtil = numUtil;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getTurnsInJail() {
		return turnsInJail;
	}

	public void setTurnsInJail(int turnsInJail) {
		this.turnsInJail = turnsInJail;
	}

	public void setBankrupt(boolean isBankrupt) {
		this.isBankrupt = isBankrupt;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	//methods
	public void roll() {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		rollValue = dice1+dice2;
		
	}
	public void buyProperty(Property p, ArrayList<Property> available ) {
		if (position == p.getPosition()) {
			if (p.getOwningPlayer()==(null)) {
				Property prop = available.remove(available.indexOf(p));
				setMoney(money-p.getPrice());
				properties.add(prop);
				p.setOwningPlayer(this);
				
			} else {
				System.out.println("PROPERTY IS OWNED");
			}
		}
	}
	public void buyHouse(NormalProperty p, int num) {
		if (p.getHouses()<3) {
			if (ownsSet(p.getColor())) {
				setMoney(money-p.getHousePrice());
				p.setHouses(p.getHouses()+num);
				for (int i = 1; i<=num; i++) {
					p.setRent(p.getRent()*2);
				}
			}
		} else {
			System.out.print("Error: Too Many Houses");
		}
	}
	public void buyHotel(NormalProperty p) {
		if (p.getHouses()==4 && p.getHotels()==0) {
			p.setHouses(0);
			p.setHotels(1);
			p.setRent(p.getRent()*2);
		} else {
			System.out.println("Error: Too Many Hotels or Not Enough Houses");
		}
	}
	public boolean ownsSet(String c) {
		int count = 0;
		if(c.equals("DARKBLUE")||c.equals("BROWN")){
			for(int i = 0; i<properties.size(); i++) {
				if (properties.get(i) instanceof NormalProperty) {
					NormalProperty p = (NormalProperty)properties.get(i);
					if(p.getColor().equals(c)) {
						count++;
					}
				}
			}
			if(count == 2) {
				return true;
			}
		}else{
			for(int i = 0; i<properties.size(); i++) {
				if (properties.get(i) instanceof NormalProperty) {
					NormalProperty p = (NormalProperty)properties.get(i);
					if(p.getColor().equals(c)) {
						count++;
					}
				}
			}
			if(count == 3) {
				return true;
			}
		}
		return false;
	}
	public void payPlayer(Player p, int amount) {
		setMoney(getMoney()-amount);
		p.setMoney(p.getMoney()+amount);
	}
	public int getNetWorth() {
		int netWorth = 0;
		netWorth += getMoney();
		for (int i = 0; i<properties.size(); i++) {
			if(properties.get(i) instanceof NormalProperty) {
				NormalProperty temp = (NormalProperty)(properties.get(i));
				netWorth += temp.getHouses()*temp.getHousePrice();
				netWorth += temp.getHotels()*temp.getHotelPrice();
			}

			netWorth += properties.get(i).getMortgage();
		}
		return netWorth;
	}
	
	public String toString() {
		return name + " " + money + " " + getNetWorth() + " " + position;
	}
}