import java.util.Scanner;

public class QuestionAsker {

	Scanner input;

	public QuestionAsker(Scanner input) {
		this.input = input;
	}

	String stringAnswer(String question) {
		System.out.println(question);
		String stringAnswer = input.nextLine();

		// Check to see if just Enter is selected or string contains any integers
		boolean hasInteger = true;
		while (hasInteger == true) {
			if (stringAnswer.toLowerCase().equals("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}else if (stringAnswer.equals("") || stringAnswer.equals(" ")) {
				System.out.println("Please type in an answer.");
				System.out.println(question);
				stringAnswer = input.nextLine();
			} else if (stringAnswer.contains("0") || stringAnswer.contains("1") || stringAnswer.contains("2")
					|| stringAnswer.contains("3") || stringAnswer.contains("4") || stringAnswer.contains("5")
					|| stringAnswer.contains("6") || stringAnswer.contains("7") || stringAnswer.contains("8")
					|| stringAnswer.contains("9")) {
				System.out.println("That answer should not contain a number.");
				System.out.println(question);
				stringAnswer = input.nextLine();
			} else {
				hasInteger = false;
			}
		}
		return stringAnswer;
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

}
