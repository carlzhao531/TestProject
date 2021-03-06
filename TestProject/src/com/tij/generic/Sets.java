package com.tij.generic;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static <T> Set<T> union(Set<T> a,Set<T> b) {
		Set<T> result = new HashSet<T>();
		result.addAll(b);
		return result;
	}
	
	public static <T> Set<T> intersection(Set<T> a,Set<T> b) {
		Set<T> result = new HashSet<T>();
		result.retainAll(b);
		return result;
	}
	
	public static <T> Set<T> difference(Set<T> superset,Set<T> subset) {
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	
	
}
