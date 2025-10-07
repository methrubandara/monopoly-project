public class NormalProperty extends Property {
	private String color;
	private int housePrice;
	private int hotelPrice;
	private int houses;
	private int hotels;
	
	public NormalProperty(int position, int x, int y, int price, int rent, String name, Player p, int mortgage, String color, int housePrice, int hotelPrice, int houses, int hotels) {
		super(position, x, y, price, rent, name, p, mortgage);
		this.color = color;
		this.housePrice = housePrice;
		this.hotelPrice = hotelPrice;
		this.houses = houses;
		this.hotels = hotels;
	}
	
	//setters and getters
	public String getColor() {
		return color;
	}
	public int getHousePrice() {
		return housePrice;
	}
	public int getHotelPrice() {
		return hotelPrice;
	}
	public int getHouses() {
		return houses;
	}
	public int getHotels() {
		return hotels;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}
	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	public void setHouses(int houses) {
		this.houses = houses;
	}
	public void setHotels(int hotels) {
		this.hotels = hotels;
	}
	
	//methods
	public void chargeRent(Player p) {
		p.setMoney(p.getMoney()-getRent());
	}
	public void changeRent(Player p) {
		// change the rent based on the houses
	}
}
