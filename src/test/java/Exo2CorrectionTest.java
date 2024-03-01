import org.example.Exo2Correction;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2CorrectionTest {

    @Test
    public void IsAnagramReturnsTrue() {
        //assertTrue(Exo2.isAnagram("", ""));
        assertTrue(Exo2Correction.isAnagram("listen", "silent"));
        assertTrue(Exo2Correction.isAnagram("LISTEN", "silent"));
        assertTrue(Exo2Correction.isAnagram("LISTEN", "SILENT"));
        assertTrue(Exo2Correction.isAnagram("School master", "The classroom"));
    }

    @Test
    public void IsAnagramReturnsFalse() {
        assertFalse(Exo2Correction.isAnagram("azerty", "querty"));
        assertFalse(Exo2Correction.isAnagram("azerty", "az"));
        assertFalse(Exo2Correction.isAnagram("aabbcc", "aabbc"));
    }

    @Test
    public void ThrowExceptionIfOneOfTheStringsIsNullOrBoth() {
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram(null, ""));
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram("", null));
        assertThrows(NullPointerException.class, () -> Exo2Correction.isAnagram(null, null));
    }
}

