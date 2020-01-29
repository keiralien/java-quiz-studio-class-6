public abstract class Question {
    private int questionID;
    private static int nextID = 1;
    private String questionType;
    private String questionText;

    public Question() {
        questionID = nextID;
        nextID++;
    }

    public Question(int questionID, String questionType, String questionText) {
        this();
        questionID = questionID;
        questionType = questionType;
        questionText = questionText;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
