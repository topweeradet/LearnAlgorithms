package src.main.java.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

        int[] arr = { 15, 21, 1, 25, 12, 6, 8, 3, 5, 19, 10, 18 };

        System.out.println("1: Selection Sort");
        System.out.println("2: Bubble Sort");
        System.out.println("3: Insertion Sort");
        System.out.println("4: Merge Sort");
        System.out.print("Select sorting algorithm: ");

        int choice = scanner.nextInt();

        SortingAlgorithm sorter;
        switch (choice) {
            case 1:
                sorter = new SelectionSort();
                break;
            case 2:
                sorter = new MergeSort();
                break;
            case 3:
                sorter = new SelectionSort();
                break;
            case 4:
                sorter = new MergeSort();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));}
    }
}