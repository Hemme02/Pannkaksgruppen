// Enkel klass för att spara frågan, svarsalternativ och index för rätt svar.

public class QuestionClass {
    String question;
    String[] choices;
    int answerIndex;

    public QuestionClass(String question, String[] choices, int answerIndex) {
        this.question = question;
        this.choices = choices;
        this.answerIndex = answerIndex;
    }

}
