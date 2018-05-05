import java.util.Scanner;

public class QuestionAsker {

	Scanner input;

	public QuestionAsker(Scanner input) {
		this.input = input;
	}

	String stringAnswer(String question) {
		System.out.println(question);
		String stringAnswer = input.nextLine();
		if (stringAnswer.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
			return stringAnswer;
		} else {
			return stringAnswer;
		}
	}

	int intAnswer(String question) {
		System.out.println(question);
		String intString = input.nextLine();

		boolean isInteger = false;
		int intValue = 0;
		while (isInteger == false) {
			try {
				if (intString.toLowerCase().equals("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				}
				intValue = Integer.parseInt(intString);
				isInteger = true;
			} catch (Exception e) {
				System.out.println("That answer is not an integer.");
				System.out.println(question);
				intString = input.nextLine();
			}
		}
		return intValue;
	}

	boolean yesOrNo(String question) {
		System.out.println(question);
		while (true) {
			String response = input.nextLine();
			switch (response.toLowerCase()) {
			case "y":
			case "yes":
				return true;
			case "n":
			case "no":
				return false;
			default:
				System.out.println("Sorry I didn't catch that.");
			}
		}
	}

}
