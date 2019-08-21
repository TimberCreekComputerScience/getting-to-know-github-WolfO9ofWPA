import java.util.Scanner;

public class Plague {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner Virus = new Scanner(System.in);
		
		System.out.println("How many STOLEN CONTRABANDs do you want?");
		int CB = Virus.nextInt();
		double SCAM = 199.99;
		double SC = (CB * SCAM);
		
		if (CB < 0)
			System.out.println("You can't SCAM the SCAMMER! You now have a virus on your computer! Good Luck!");
		else System.out.println("You want " + CB + " STOLEN CONTRABANDs \nYou also have to give $" + SC + "\nYou also have " + (CB / 2) + " Viruses!");
	}

}
