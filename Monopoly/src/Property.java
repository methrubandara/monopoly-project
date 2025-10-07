public class Property extends Space {
	//instance variables
	private int price;
	private int rent; //rent should be 0 for properties that dont need one
	private String name;
	private Player owningPlayer;
	private int mortgage;
	
	//constructors
	public Property(int position, int x, int y, int price, int rent, String name, Player player, int mortgage) {
		super(position, x, y);
		this.price = price;
		this.rent = rent;
		this.name = name;
		owningPlayer = player;
		this.mortgage = mortgage;
	}
	
	//setters and getters
	public int getPrice() {
		return price;
	}
	public int getRent() {
		return rent;
	}
	public Player getOwningPlayer() {
		return owningPlayer;
	}
	public int getMortgage() {
		return mortgage;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public void setOwningPlayer(Player p) {
		owningPlayer = p;
	}
	public void setMortgage(int mortgage) {
		this.mortgage = mortgage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
