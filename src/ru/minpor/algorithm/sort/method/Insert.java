package ru.minpor.algorithm.sort.method;

import ru.minpor.algorithm.sort.Compare;

public class Insert extends Compare {
	@Override
	public Comparable[] sort(Comparable[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
		return a;
	}
}
