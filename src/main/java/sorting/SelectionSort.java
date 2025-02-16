package src.main.java.sorting;

import src.main.java.AlgorithmCategory;
import src.main.java.AlgorithmType;

@AlgorithmCategory(AlgorithmType.BRUTE_FORCE)
public class SelectionSort implements SortingAlgorithm {

    /*
     * @param arr - array to be sorted
     * Time Complexity: All cases - O(n^2)
     * Space Complexity: O(1)
     * Not-Stable
     * Technique: Selection
     */

    @Override
    public void sort(int[] arr) {

        int n = arr.length, i, j, temp;

        for (i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (j = i + 1; j < n - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    
}