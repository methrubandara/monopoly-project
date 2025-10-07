public class GoToJail extends Space {
	public GoToJail(int pos, int x, int y) {
		super(pos, x, y);
	}
	
	public void landedOn(Player p) {
		System.out.println(p.getName() + ", you are in Jail.");
		p.setInJail(true);
		p.setTurnsInJail(3);
	}
}
