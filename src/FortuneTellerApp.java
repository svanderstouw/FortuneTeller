import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		QuestionAsker ask = new QuestionAsker(input);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

		String firstName = ask.stringAnswer("What is your first name?");

		String lastName = ask.stringAnswer("What is your last name?");

		int age = ask.intAnswer("What is your age?");

		int retireYears;
		if (age % 2 == 0) {
			retireYears = 23;
		} else {
			retireYears = 15;
		}

		int birthMonth = ask.intAnswer("What is your birth month as an integer?");

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

		String vehicle = "donkey";
		switch (favoriteColor.toLowerCase()) {
		case "red":
			vehicle = "Vespa";
			break;
		case "orange":
			vehicle = "minivan";
			break;
		case "yellow":
			vehicle = "portkey";
			break;
		case "green":
			vehicle = "Porsche";
			break;
		case "blue":
			vehicle = "TARDIS";
			break;
		case "indigo":
			vehicle = "TIE fighter";
			break;
		case "violet":
			vehicle = "hovercraft";
			break;
		}

		int numSiblings = ask.intAnswer("How many siblings do you have?");

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

		System.out.println(firstName + " " + lastName + " will retire in " + retireYears + " years with "
				+ currency.format(balance) + " in the bank, a vacation home in " + vacationHome + ", and travel by "
				+ vehicle + ".");

		input.close();

	}

}