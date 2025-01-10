package com.softserve.duplicateremover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LinkedHashSetDuplicateRemoverTest {

	@Test
    public void testWithAlphanumericDuplicates() {
        assertEquals("ABCD123", LinkedHashSetDuplicateRemover.removeDuplicates("AABBCCD112233"));
    }

    @Test
    public void testWithMixedCaseCharacters() {
        assertEquals("aABbCc", LinkedHashSetDuplicateRemover.removeDuplicates("aAaBbBbCcC"));
    }

    @Test
    public void testWithSpecialCharacters() {
        assertEquals("a1!@", LinkedHashSetDuplicateRemover.removeDuplicates("a1!!@@1a"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", LinkedHashSetDuplicateRemover.removeDuplicates(""));
    }

    @Test
    public void testNullInput() {
        assertNull(LinkedHashSetDuplicateRemover.removeDuplicates(null));
    }

    @Test
    public void testSingleCharacterRepeated() {
        assertEquals("A", LinkedHashSetDuplicateRemover.removeDuplicates("AAAAAA"));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertEquals("abcdef", LinkedHashSetDuplicateRemover.removeDuplicates("abcdef"));
    }

}
