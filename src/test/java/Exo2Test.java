import org.example.Exo2;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void IsAnagramReturnsTrue() {
        assertTrue(Exo2.isAnagram("", ""));
        assertTrue(Exo2.isAnagram("listen", "silent"));
        assertTrue(Exo2.isAnagram("LISTEN", "silent"));
        assertTrue(Exo2.isAnagram("LISTEN", "SILENT"));
        assertTrue(Exo2.isAnagram("School master", "The classroom"));
    }

    @Test
    public void IsAnagramReturnsFalse() {
        assertFalse(Exo2.isAnagram("azerty", "querty"));
        assertFalse(Exo2.isAnagram("azerty", "az"));
        assertFalse(Exo2.isAnagram("aabbcc", "aabbc"));
    }

    @Test
    public void ThrowExceptionIfOneOfTheStringsIsNullOrBoth() {
        assertThrows(NullPointerException.class, () -> Exo2.isAnagram(null, ""));
        assertThrows(NullPointerException.class, () -> Exo2.isAnagram("", null));
        assertThrows(NullPointerException.class, () -> Exo2.isAnagram(null, null));
    }
}

