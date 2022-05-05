package JavaLab.Lab_7_BinarySort;

public class Main {
    public static void main(String[] args) {
        BinarySort binarySort = new BinarySort();
        int number = binarySort.inputNumber("Enter number of array: ", "array");
        int[] array = binarySort.createArray();
        binarySort.printArray("Random array: ");
        int x = binarySort.inputNumber("Enter seach value: ", "value");
        binarySort.quickSort(array, 0, number - 1);
        binarySort.printArray("Sorted array: ");
        System.out.println("Found " + x + " at index: " + binarySort.binarySearch(0, number - 1));
    }
}
