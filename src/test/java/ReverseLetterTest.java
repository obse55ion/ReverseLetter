import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLetterTest {

    @Test
    void reverseOnlyLetters() {
        String result = ReverseLetter.reverseLetter("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void reverse_WhenEmptyString() {
        assertEquals("", ReverseLetter.reverseLetter(""));
    }

    @Test
    void reverse_WhenSingleLetterInString() {
        assertEquals("a", ReverseLetter.reverseLetter("a"));
    }

    @Test
    void reverse_WhenNoLetterInString() {
        assertEquals("123 !@#", ReverseLetter.reverseLetter("123 !@#"));
    }

    @Test
    void reverse_WhenOnlyLetterInString() {
        assertEquals("abcd", ReverseLetter.reverseLetter("dcba"));
    }

    @Test
    void reverse_WhenNoLetterOnSidesInString() {
        assertEquals("$dc2ba@", ReverseLetter.reverseLetter("$ab2cd@"));
    }

    @Test
    void reverse_LetterTravelWithRegister() {
        assertEquals("RevERseLettER", ReverseLetter.reverseLetter("REtteLesREveR"));
    }

    @Test
    void shouldThrowNpe_WhenInputIsNull() {
        assertEquals(null, ReverseLetter.reverseLetter(null));
    }

}