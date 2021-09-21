package kata6kyu;

import static org.junit.Assert.*;

import org.junit.Test;

public class HighestScoringWordTest {

	@Test
	public void test() {
		assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
        //edge case
        assertEquals("aa", HighestScoringWord.high("aa b"));
        assertEquals("b", HighestScoringWord.high("b aa"));
	}

}
