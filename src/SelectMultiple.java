import java.util.ArrayList;
import java.util.List;

public class SelectMultiple extends Question {

    private List<Integer> answer = new ArrayList<>();
    private List<String> possibleAnswers = new ArrayList<>();


    public SelectMultiple (int questionID, String questionType, String questionText, ArrayList<Integer> answer, ArrayList<String> possibleAnswers) {
        super (questionID, questionType, questionText);
        answer = answer;
        possibleAnswers = possibleAnswers;
    }

    public List<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Integer> answer) {
        this.answer = answer;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public boolean checkAnswer(ArrayList<Integer> response) {
        if(response.size() == this.answer.size()) {
            for (int i = 0; i < response.size(); i++) {
                if (!this.answer.contains(response.get(i))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
