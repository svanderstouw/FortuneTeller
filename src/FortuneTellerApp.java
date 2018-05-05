import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTellerApp {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		QuestionAsker ask = new QuestionAsker(input);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

		String firstName = ask.stringAnswer("What is your first name?");

//		System.out.println("What is your first name?");
//		String firstName = input.nextLine();
//		if (firstName.toLowerCase().equals("quit")) {
//			System.out.println("Nobody likes a quitter...");
//			System.exit(0);
//		}

		String lastName = ask.stringAnswer("What is your last name?");
		
//		System.out.println("What is your last name?");
//		String lastName = input.nextLine();
//		if (lastName.toLowerCase().equals("quit")) {
//			System.out.println("Nobody likes a quitter...");
//			System.exit(0);
//		}

		int age = ask.intAnswer("What is your age?");
		
//		System.out.println("What is your age?");
//		String ageString = input.nextLine();
//		int age = 0;
//		if (ageString.toLowerCase().equals("quit")) {
//			System.out.println("Nobody likes a quitter...");
//			System.exit(0);
//		} else {
//			age = Integer.parseInt(ageString);
//		}
		
		String retireYears;
		if (age % 2 == 0) {
			retireYears = "23 years";
		} else {
			retireYears = "15 years";
		}

		int birthMonth = ask.intAnswer("What is your birth month as an integer?");
		
//		System.out.println("What is your birth month as an integer?");
//		String monthString = input.nextLine();
//		int birthMonth = 0;
//		if (monthString.toLowerCase().equals("quit")) {
//			System.out.println("Nobody likes a quitter...");
//			System.exit(0);
//		} else {
//			birthMonth = Integer.parseInt(monthString);
//		}

		double balance;
		if (birthMonth >= 1 && birthMonth <= 4) {
			balance = 536923.45;
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			balance = 1269743.99;
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			balance = 29.01;
		} else {
			balance = 0;
		}

		String favoriteColor = ask.stringAnswer("What is your favorite ROYGBIV color? (Type \"Help\" to get a list of ROYGBIV colors)");
		while (favoriteColor.toLowerCase().equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo and violet.");
			favoriteColor = ask.stringAnswer("What is your favorite ROYGBIV color?");
		}
		
//		System.out.println("What is your favorite ROYGBIV color? (Type \"Help\" to get a list of ROYGBIV colors)");
//		String favoriteColor = input.nextLine();
//		while (favoriteColor.toLowerCase().equals("help")) {
//			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo and violet.");
//			System.out.println("What is your favorite ROYGBIV color?");
//			favoriteColor = input.nextLine();
//		}
//
//		if (favoriteColor.toLowerCase().equals("quit")) {
//			System.out.println("Nobody likes a quitter...");
//			System.exit(0);
//		}

		String vehicle = "";
		switch (favoriteColor.toLowerCase()) {
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

		int numSiblings = ask.intAnswer("How many siblings do you have?");
		
//		System.out.println("How many siblings do you have?");
//		String siblingString = input.nextLine();
//		int numSiblings = -1;
//		if (siblingString.toLowerCase().equals("quit")) {
//			System.out.println("Nobody likes a quitter...");
//			System.exit(0);
//		} else {
//			numSiblings = Integer.parseInt(siblingString);
//		}

		String vacationHome;
		if (numSiblings == 0) {
			vacationHome = "Key West, Florida";
		} else if (numSiblings == 1) {
			vacationHome = "Cabo Rojo, Puerto Rico";
		} else if (numSiblings == 2) {
			vacationHome = "Nazare, Portugal";
		} else if (numSiblings == 3) {
			vacationHome = "Riomaggiore, Italy";
		} else if (numSiblings > 3) {
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