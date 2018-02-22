import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    @Test
    void solution() {
        String S1 = "[{()}]";
        assertEquals(1,Brackets.solution(S1));

        String S2 = "[{(()}]";
        assertEquals(0,Brackets.solution(S2));

        String S3 = "[1{1(1)1}1]";
        assertEquals(1,Brackets.solution(S3));

        String S4 = "1234535";
        assertEquals(1,Brackets.solution(S4));

        String S5 = "(((((())))))";
        assertEquals(1,Brackets.solution(S5));

        String S6 = "()()()()()()(";
        assertEquals(0,Brackets.solution(S6));

        String S7 = "())";
        assertEquals(0,Brackets.solution(S7));
    }
}