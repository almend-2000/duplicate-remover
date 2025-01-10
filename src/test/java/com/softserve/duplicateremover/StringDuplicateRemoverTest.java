package com.softserve.duplicateremover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringDuplicateRemoverTest {

	@Test
    public void testWithAlphanumericDuplicates() {
        assertEquals("ABCD123", StringDuplicateRemover.removeDuplicates("AABBCCD112233"));
    }

    @Test
    public void testWithMixedCaseCharacters() {
        assertEquals("aABbCc", StringDuplicateRemover.removeDuplicates("aAaBbBbCcC"));
    }

    @Test
    public void testWithSpecialCharacters() {
        assertEquals("a1!@", StringDuplicateRemover.removeDuplicates("a1!!@@1a"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", StringDuplicateRemover.removeDuplicates(""));
    }

    @Test
    public void testNullInput() {
        assertNull(StringDuplicateRemover.removeDuplicates(null));
    }

    @Test
    public void testSingleCharacterRepeated() {
        assertEquals("A", StringDuplicateRemover.removeDuplicates("AAAAAA"));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertEquals("abcdef", StringDuplicateRemover.removeDuplicates("abcdef"));
    }

}
