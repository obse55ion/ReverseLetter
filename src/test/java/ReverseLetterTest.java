import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLetterTest {

    private final ReverseLetter reverseLetter = new ReverseLetter();

    @Test
    void reverseLetter() {
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
    void oneLetter() {
        assertEquals("abcd", ReverseLetter.reverseLetter("dcba"));
    }

    @Test
    void noLetterAround() {
        assertEquals("$dc2ba@", ReverseLetter.reverseLetter("$ab2cd@"));
    }

    @Test
    void letterTravelWithRegister(){
        assertEquals("RevERseLettER", ReverseLetter.reverseLetter("REtteLesREveR"));
    }

    @Test
    void NullInput() {
        assertEquals(null, ReverseLetter.reverseLetter(null));
    }

}