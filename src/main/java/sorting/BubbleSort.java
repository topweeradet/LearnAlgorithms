package src.main.java.sorting;

import src.main.java.AlgorithmCategory;
import src.main.java.AlgorithmType;

@AlgorithmCategory(AlgorithmType.BRUTE_FORCE)
public class BubbleSort implements SortingAlgorithm {

    /*
     * @param arr - array to be sorted
     * Time Complexity: Best - O(n), Worst - O(n^2), Avg - O(n^2)
     * Space Complexity: O(1)
     * Stable
     * Technique: Swapping - Early Terminated
     */

    @Override
    public void sort(int[] arr) {
        
        int n = arr.length, i, j, temp;
        boolean swap;

        for (i = 0; i < n - 1; i++) {
            swap = false;
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }

}