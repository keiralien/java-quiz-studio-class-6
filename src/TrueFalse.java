public class TrueFalse extends Question{

    private Boolean answer;

    public TrueFalse (int questionID, String questionType, String questionText, Boolean answer) {
        super(questionID, questionType, questionText);
        answer = answer;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(Boolean response) {
        if(response.equals(this.answer)) {
            return true;
        } else {
            return false;
        }
    }
}
