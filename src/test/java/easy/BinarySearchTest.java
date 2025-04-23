package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testFoundElement() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        assertEquals(expected, binarySearch.search(nums, target));
    }

    @Test
    void testNotFoundElement() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        assertEquals(expected, binarySearch.search(nums, target));
    }

    @Test
    void testSingleElementFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1};
        int target = 1;
        assertEquals(0, binarySearch.search(nums, target));
    }

    @Test
    void testEmptyArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {};
        int target = 5;
        assertEquals(-1, binarySearch.search(nums, target));
    }
}
