import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLetterTest {

    @Test
    void reverseOnlyLetters() {
        String result = ReverseLetter.reverseLetter("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void emptyString() {
        assertEquals("", ReverseLetter.reverseLetter(""));
    }

    @Test
    void singleLetterInString() {
        assertEquals("a", ReverseLetter.reverseLetter("a"));
    }

    @Test
    void noLetterInString() {
        assertEquals("123 !@#", ReverseLetter.reverseLetter("123 !@#"));
    }

    @Test
    void OnlyLetterInString() {
        assertEquals("abcd", ReverseLetter.reverseLetter("dcba"));
    }

    @Test
    void noLetterOnSidesInString() {
        assertEquals("$dc2ba@", ReverseLetter.reverseLetter("$ab2cd@"));
    }

    @Test
    void letterTravelWithRegister() {
        assertEquals("RevERseLettER", ReverseLetter.reverseLetter("REtteLesREveR"));
    }

    @Test
    void nullInputInMethod() {
        assertEquals(null, ReverseLetter.reverseLetter(null));
    }

}