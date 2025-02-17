package src.main.java.sorting;

import src.main.java.AlgorithmCategory;
import src.main.java.AlgorithmType;

@AlgorithmCategory(AlgorithmType.DECREASE_AND_CONQUER)
public class InsertionSort implements SortingAlgorithm {

    /*
     * @param arr - array to be sorted
     * Time Complexity: Best - O(n), Worst - O(n^2), Avg - O((n^2)/4)
     * Space Complexity: O(1)
     * Stable
     * Technique: Insertion
     */

    @Override
    public void sort(int[] arr) {
        
        int n = arr.length, i, j, v;

        for (i = 1; i < n - 1; i++) {
            v = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > v) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = v;
        }

    }

}