import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTellerApp {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		System.out.println("What is your age?");
		String ageString = input.nextLine();
		int age = 0;
		if (ageString.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			age = Integer.parseInt(ageString);
		}

		String retireYears;
		if (age % 2 == 0) {
			retireYears = "23 years";
		} else {
			retireYears = "15 years";
		}

		System.out.println("What is your birth month as an integer?");
		String monthString = input.nextLine();
		int month = 0;
		if (monthString.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			month = Integer.parseInt(monthString);
		}

		double balance;
		if (month >= 1 && month <= 4) {
			balance = 536923.45;
		} else if (month >= 5 && month <= 8) {
			balance = 1269743.99;
		} else if (month >= 9 && month <= 12) {
			balance = 29.01;
		} else {
			balance = 0;
		}

		System.out.println("What is your favorite ROYGBIV color? (Type \"Help\" to get a list of ROYGBIV colors)");
		String royColor = input.nextLine();
		while (royColor.toLowerCase().equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo and violet.");
			System.out.println("What is your favorite ROYGBIV color?");
			royColor = input.nextLine();
		}

		if (royColor.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		String vehicle = "";
		switch (royColor.toLowerCase()) {
		case "red":
			vehicle = "Vespa";
			break;
		case "orange":
			vehicle = "tuk tuk";
			break;
		case "yellow":
			vehicle = "bicycle";
			break;
		case "green":
			vehicle = "Porsche";
			break;
		case "blue":
			vehicle = "trolley";
			break;
		case "indigo":
			vehicle = "sailboat";
			break;
		case "violet":
			vehicle = "hovercraft";
			break;
		default:
			vehicle = "donkey";
		}

		System.out.println("How many siblings do you have?");
		String siblingString = input.nextLine();
		int siblings = -1;
		if (siblingString.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			siblings = Integer.parseInt(siblingString);
		}

		String vacationHome;
		if (siblings == 0) {
			vacationHome = "Key West, Florida";
		} else if (siblings == 1) {
			vacationHome = "Cabo Rojo, Puerto Rico";
		} else if (siblings == 2) {
			vacationHome = "Nazare, Portugal";
		} else if (siblings == 3) {
			vacationHome = "Riomaggiore, Italy";
		} else if (siblings > 3) {
			vacationHome = "Lahaina, Hawaii";
		} else {
			vacationHome = "Fremont, Ohio";
		}

		System.out.println(
				firstName + " " + lastName + " will retire in " + retireYears + " with " + currency.format(balance)
						+ " in the bank, a vacation home in " + vacationHome + ", and travel by " + vehicle + ".");

		input.close();

	}

}