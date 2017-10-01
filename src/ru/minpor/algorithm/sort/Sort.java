package ru.minpor.algorithm.sort;

import ru.minpor.algorithm.sort.method.InsertionSort;
import ru.minpor.algorithm.sort.method.SelectionSort;
import ru.minpor.algorithm.sort.method.ShellSort;

public class Sort {
	// count of elements
	private final static Integer ELEMENT_COUNT = 1000;

	public static void main(String[] args) {
		Integer[] a = new Integer[ELEMENT_COUNT];
		System.out.println("without sorting");
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			a[i] = (int) (Math.random() * ELEMENT_COUNT);
		}

		print(a);

		// алгоритмы сортировок
		System.out.println("Sort method: Selection");
		sort(new SelectionSort(), a, false);

		System.out.println("Sort method: Insertion");
		sort(new InsertionSort(), a, false);

		System.out.println("Sort method: Shell");
		sort(new ShellSort(), a, false);
	}

	private static void sort(Compare c, Comparable[] a, boolean show) {
		// make clone for clean tests
		Comparable[] b = a.clone();
		long time = System.currentTimeMillis();
		c.executeSort(b);
		System.out.print(String.format(" time: %d", System.currentTimeMillis() - time));
		System.out.println();
		if (show) {
			print(b);
		}
	}

	private static void print(Comparable[] a) {
		for (Comparable element : a) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
