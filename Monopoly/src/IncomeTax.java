import java.util.Scanner;

public class IncomeTax extends Space {
	
	public static Scanner console = new Scanner(System.in);
	
	public IncomeTax(int pos, int x, int y) {
		super(pos, x, y);
	}
	
	public void tax(Player p) {
		System.out.println("You landed on Income Tax. You can pay either 10% or $200. Enter which one: (10% or $200): ");
		String answer = console.next().toLowerCase();
		boolean pay200 = false;
		boolean valid = false;
		while (valid == false) {
			if (answer.contains("10") || answer.contains("ten") || answer.equals("10%")) {
				pay200 = false;
				valid = true;
			} else if (answer.contains("200") || answer.equals("$200")) {
				pay200 = true;
				valid = true;
			} else {
				valid = false;
				System.out.println("INVALID. TRY AGAIN. You can pay either 10% or $200. Enter which one: (10% or $200): ");
				answer = console.next().toLowerCase();
			}
		}
		if (pay200) {
			p.setMoney(p.getMoney()-200);
		} else {
			p.setMoney(p.getMoney()-(p.getNetWorth()*10)/100);
		}
	}
}
