import org.junit.Test;
import static org.junit.Assert.*;

public class TitleCaseConverterTest {
	private final TitleCaseConverter converter = new TitleCaseConverter();

    @Test
    public void testNormalCase() {
        assertEquals("Hello World", converter.toTitleCase("hello world"));
    }

    @Test
    public void testMixedCase() {
        assertEquals("Java Programming", converter.toTitleCase("jAvA pROgRAmMIng"));
    }

    @Test
    public void testLeadingAndTrailingSpaces() {
        assertEquals("Hello World", converter.toTitleCase("   hello world   "));
    }

    @Test
    public void testSingleWord() {
        assertEquals("Hello", converter.toTitleCase("hello"));
        assertEquals("A", converter.toTitleCase("a"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", converter.toTitleCase(""));
    }

    @Test
    public void testNullInput() {
        assertNull(converter.toTitleCase(null));
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        assertEquals("Hello World", converter.toTitleCase("hello    world"));
    }

    @Test
    public void testAllUppercase() {
        assertEquals("Hello World", converter.toTitleCase("HELLO WORLD"));
    }

    @Test
    public void testAllLowercase() {
        assertEquals("Hello World", converter.toTitleCase("hello world"));
    }
}
