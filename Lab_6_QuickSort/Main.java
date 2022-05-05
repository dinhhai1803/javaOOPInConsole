package JavaLab.Lab_6_QuickSort;

import Algorithms.quickSort;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.inputNumber();
        quickSort.createRandomArray();
        quickSort.print("Original Array: ");
        quickSort.QuickSortAlgorithm();
        quickSort.print("After sorted: ");
    }

    
}
