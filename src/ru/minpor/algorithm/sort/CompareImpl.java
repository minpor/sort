package ru.minpor.algorithm.sort;

public interface CompareImpl {
	void exch(Comparable[] a, int i, int j);
	Comparable[] executeSort(Comparable[] a);
	boolean less(Comparable v, Comparable w);
}
