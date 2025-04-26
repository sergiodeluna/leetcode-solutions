package easy;

import easy.mocks.FirstBadVersionMock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void testFirstBadAtBeginning() {
        FirstBadVersionMock versionControl = new FirstBadVersionMock(1);
        int result = versionControl.findFirstBadVersion(5);
        assertEquals(1, result);
    }

    @Test
    void testFirstBadAtMiddle() {
        FirstBadVersionMock versionControl = new FirstBadVersionMock(3);
        int result = versionControl.findFirstBadVersion(5);
        assertEquals(3, result);
    }

    @Test
    void testFirstBadAtEnd() {
        FirstBadVersionMock versionControl = new FirstBadVersionMock(5);
        int result = versionControl.findFirstBadVersion(5);
        assertEquals(5, result);
    }

    @Test
    void testOnlyOneVersionAndIsBad() {
        FirstBadVersionMock versionControl = new FirstBadVersionMock(1);
        int result = versionControl.findFirstBadVersion(1);
        assertEquals(1, result);
    }

    @Test
    void testLargeNumberOfVersions() {
        FirstBadVersionMock versionControl = new FirstBadVersionMock(789);
        int result = versionControl.findFirstBadVersion(1000);
        assertEquals(789, result);
    }
}
