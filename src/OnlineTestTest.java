
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnlineTestTest {

    @org.junit.Test
    public void check() {
        OnlineTest testclass = new OnlineTest("s");
        testclass.current = 0;
        testclass.jb[1].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 1;
        testclass.jb[2].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 2;
        testclass.jb[3].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 3;
        testclass.jb[0].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 4;
        testclass.jb[2].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 5;
        testclass.jb[2].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 6;
        testclass.jb[1].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 7;
        testclass.jb[3].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 8;
        testclass.jb[1].setSelected(true);
        assertTrue(testclass.check());

        testclass.current = 9;
        testclass.jb[2].setSelected(true);
        assertTrue(testclass.check());

        int[][] all_wrong_answers = {{0, 2, 3}, {0, 1, 3}, {0, 1, 2}, {1, 2, 3}, {0, 1, 3}, {0, 1, 3}, {0, 2, 3}, {0, 1, 2}, {0, 2, 3}, {0, 1, 3}};

        for (int i = 0; i != 10; i++){
            testclass.current = i;
            for (int answer:all_wrong_answers[i]) {
                testclass.jb[answer].setSelected(true);
                assertFalse(testclass.check());

            }

        }

    }
    private OnlineTest onlineTest;

    @Before
    public void setUp() {
        onlineTest = new OnlineTest("s");
    }

    @Test
    public void testCheckCorrectAnswer(){
        for (int i = 0; i < onlineTest.questions.questions.size(); i++) {
            onlineTest.current = i;
            int answer = onlineTest.questions.questions.get(i).answerIndex;
            onlineTest.jb[answer].setSelected(true);
            assertTrue(onlineTest.check());
        }

    }

    @Test
    public void testCheckWrongAnswer(){
        int[] allanswers = new int[4];
        allanswers[0] = 1;
        allanswers[1] = 2;
        allanswers[2] = 3;
        allanswers[3] = 4;

        for (int i = 0; i < onlineTest.questions.questions.size(); i++) {
            onlineTest.current = i;
            int answer = onlineTest.questions.questions.get(i).answerIndex;
            for (int j = 0; j < allanswers.length; j++) {
                if (allanswers[j] == answer){
                    continue;
                }
                else{
                    onlineTest.jb[allanswers[j]].setSelected(true);
                    assertFalse(onlineTest.check());
                }
            }
        }
    }

    @Test
    public void testOfNext(){
        for (int i = 0; i < onlineTest.questions.questions.size() - 1; i++) {
            onlineTest.current = i;
            QuestionClass nextQuestion = onlineTest.questions.questions.get(i+1);
            onlineTest.current++;
            onlineTest.next();
            assertEquals(onlineTest.l.getText(),nextQuestion.question);
        }
    }
}