package ru.minpor.algorithm.sort.method;

import ru.minpor.algorithm.sort.Compare;
import ru.minpor.algorithm.sort.SortImpl;

public class SelectionSort extends Compare implements SortImpl {
	@Override
	public Comparable[] sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}
		return a;
	}
}
