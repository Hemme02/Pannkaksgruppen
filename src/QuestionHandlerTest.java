import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionHandlerTest {

    private QuestionHandler test;

    @Before
    public void setUp(){
        test = new QuestionHandler();
    }

    // Test for Arraylist. If new questions are added actual must be increased
    @Test
    public void questionHandler(){
        assertEquals(test.questions.size(), 14);
    }

    // Test that questions is created correct and are in the correct index
    @Test
    public void questionHandlerArray(){
        assertEquals(test.questions.get(1).question, "Que2: Which class is available to all the class automatically?");
        assertEquals(test.questions.get(1).choices[0], "Swing");
        assertEquals(test.questions.get(1).choices[1], "Applet");
        assertEquals(test.questions.get(1).choices[2], "Object");
        assertEquals(test.questions.get(1).choices[3], "ActionEvent");
        assertEquals(test.questions.get(1).answerIndex, 2);
    }

    // Test that we get the correct question from function getQuestionAtIndex
    @Test
    public void getQuestionAtIndex(){
        QuestionClass question = test.getQuestionAtIndex(1);
        assertEquals(question.question, "Que2: Which class is available to all the class automatically?");
    }
}
