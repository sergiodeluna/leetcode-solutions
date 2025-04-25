package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void testElementExistsInMiddle() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }

    @Test
    void testElementShouldBeInsertedAtBeginning() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int expected = 0;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }

    @Test
    void testElementShouldBeInsertedAtEnd() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }

    @Test
    void testElementShouldBeInsertedInMiddle() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }

    @Test
    void testSingleElementArrayInsertBefore() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {5};
        int target = 2;
        int expected = 0;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }

    @Test
    void testSingleElementArrayInsertAfter() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {5};
        int target = 10;
        int expected = 1;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }

    @Test
    void testInsertIntoEmptyArray() {
        SearchInsertPosition searchInsert = new SearchInsertPosition();
        int[] nums = {};
        int target = 1;
        int expected = 0;
        assertEquals(expected, searchInsert.searchInsertPosition(nums, target));
    }
}
