package ru.minpor.algorithm.sort;

import ru.minpor.algorithm.sort.compare.Compare;
import ru.minpor.algorithm.sort.method.SortMethod;
import ru.minpor.algorithm.sort.utils.SortUtils;

public class Run {
	// count of elements
	private final static Integer ELEMENT_COUNT = 1000;

	// main class for execute example
	public static void main(String[] args) {
		Integer[] a = new Integer[ELEMENT_COUNT];
		System.out.println("without sorting");
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			a[i] = (int) (Math.random() * ELEMENT_COUNT);
		}

		print(a);

		System.out.println("Sort method: Selection");
		sort(a, SortMethod.SELECTION, false);

		System.out.println("Sort method: Insertion");
		sort(a, SortMethod.INSERTION, false);

		System.out.println("Sort method: Shell");
		sort(a, SortMethod.SHELL, false);
	}

	// test void for check time. You can only run SortUtils.sorting(Comparable[] c, SortMethod s) method;
	private static void sort(Comparable[] a, SortMethod sortMethod, boolean show) {
		// make clone for clean tests
		Comparable[] b = a.clone();
		long time = System.currentTimeMillis();
		SortUtils.sorting(b, sortMethod);
		// exception if array didn't sort
		assert new Compare().isSorted(b);
		System.out.print(String.format(" time: %d", System.currentTimeMillis() - time));
		System.out.println();
		if (show) {
			print(b);
		}
	}

	// print result
	private static void print(Comparable[] a) {
		for (Comparable element : a) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
