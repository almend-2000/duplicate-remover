package com.softserve.duplicateremover;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class LinkedHashSetDuplicateRemover {
	
	 public static String removeDuplicates(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        }
	        Collection<Character> result = input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.toCollection(LinkedHashSet::new));

	        return result.stream()
	                .map(String::valueOf)
	                .collect(Collectors.joining());
	    }
}
