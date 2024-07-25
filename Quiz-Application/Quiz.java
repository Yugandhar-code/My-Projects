import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}


