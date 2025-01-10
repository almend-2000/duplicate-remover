package com.softserve.duplicateremover;

import java.util.stream.Collectors;

public class StringDuplicateRemover {
	public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
