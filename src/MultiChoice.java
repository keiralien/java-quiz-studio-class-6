import java.util.HashMap;
import java.util.Map;

public class MultiChoice extends Question{
    private String answer;
    private Map<String,String> potentialAnswers = new HashMap<>();

    public MultiChoice (int questionID, String questionType, String questionText, String answer, HashMap<String, String> potentialAnswers) {
        super(questionID, questionType, questionText);
        answer = answer;
        potentialAnswers = potentialAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Map<String, String> getPotentialAnswers() {
        return potentialAnswers;
    }

    public void setPotentialAnswers(Map<String, String> potentialAnswers) {
        this.potentialAnswers = potentialAnswers;
    }

    public boolean checkAnswer(String response) {
        if(response.equals(this.answer)) {
            return true;
        } else {
            return false;
        }
    }
}
