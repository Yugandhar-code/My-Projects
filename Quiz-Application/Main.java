import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question("What is the capital of France?", new String[]{"Paris", "London", "Rome", "Berlin"}, 1));
        quiz.addQuestion(new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 2));
        quiz.addQuestion(new Question("What is the color of the sky?", new String[]{"Green", "Blue", "Red", "Yellow"}, 2));

        System.out.println("Welcome to the Quiz!");
        System.out.println("Please select the correct answer by entering the corresponding number.\n");

        for (Question question : quiz.getQuestions()) {
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
            int userAnswer = scanner.nextInt();
            if (userAnswer == question.getCorrectAnswer()) {
                quiz.incrementScore();
            }
        }

        System.out.println("\nYou completed the quiz!");
        System.out.println("Your score: " + quiz.getScore() + "/" + quiz.getQuestions().size());
    }
}


