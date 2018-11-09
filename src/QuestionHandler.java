import java.util.ArrayList;

public class QuestionHandler {
    ArrayList<QuestionClass> questions;

    public QuestionHandler() {
        this.questions = new ArrayList<>();
        generateQuestions();
    }

    private void generateQuestions(){ // Fyller listan med frågor. Nya frågor läggs in här. Skapar ett frågeobject och lägger in det i listan.
        String question;
        String[] choices = new String[4];
        int answer;

        question = "Que1: Which one among these is not a primitive datatype?";
        choices[0] = "int";
        choices[1] = "Float";
        choices[2] = "boolean";
        choices[3] = "char";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que2: Which class is available to all the class automatically?";
        choices[0] = "Swing";
        choices[1] = "Applet";
        choices[2] = "Object";
        choices[3] = "ActionEvent";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que3: Which package is directly available to our class without importing it?";
        choices[0] = "swing";
        choices[1] = "applet";
        choices[2] = "net";
        choices[3] = "lang";
        answer = 3;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que4: String class is defined in which package?";
        choices[0] = "lang";
        choices[1] = "Swing";
        choices[2] = "Applet";
        choices[3] = "awt";
        answer = 0;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que5: Which institute is best for java coaching?";
        choices[0] = "Utek";
        choices[1] = "Aptech";
        choices[2] = "SSS IT";
        choices[3] = "jtek";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que6: Which one among these is not a keyword?";
        choices[0] = "class";
        choices[1] = "int";
        choices[2] = "get";
        choices[3] = "if";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que7: Which one among these is not a class? ";
        choices[0] = "Swing";
        choices[1] = "ActionPerformed";
        choices[2] = "ActionEvent";
        choices[3] = "Button";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que8: which one among these is not a function of Object class?";
        choices[0] = "toString";
        choices[1] = "finalize";
        choices[2] = "equals";
        choices[3] = "getDocumentBase";
        answer = 3;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que9: which function is not present in Applet class?";
        choices[0] = "init";
        choices[1] = "main";
        choices[2] = "start";
        choices[3] = "destroy";
        answer = 1;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

        question = "Que10: Which one among these is not a valid component?";
        choices[0] = "JButton";
        choices[1] = "JList";
        choices[2] = "JButtonGroup";
        choices[3] = "JTextArea";
        answer = 2;
        this.questions.add(new QuestionClass(question, choices.clone(), answer));

    }

    public QuestionClass getQuestionAtIndex(int i){ // Returnerar frågan som finns på kallade indexet
        return this.questions.get(i);
    }
}
