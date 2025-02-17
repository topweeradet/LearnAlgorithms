package src.main.java.sorting;

import java.util.Arrays;

import src.main.java.AlgorithmCategory;
import src.main.java.AlgorithmType;

@AlgorithmCategory(AlgorithmType.DIVIDE_AND_CONQUER)
public class MergeSort implements SortingAlgorithm {

    /*
     * @param arr - array to be sorted
     * Time Complexity: All cases - O(nlogn)
     * Space Complexity: O(n)
     * Stable
     * Technique: Merging
     */

    @Override
    public void sort(int[] arr) {
        
        // size of the array and sub-arrays
        int n = arr.length, l, r;
        if (n > 1) {
            
            l = (int)Math.floor(n / 2);
            r = n - l;
            // System.out.println(l + ", " + r);
            
            int[] leftArr = new int[l];
            int[] rightArr = new int[r];

            // left array
            for (int i = 0; i < l; i++) {
                leftArr[i] = arr[i];
            }
            // right array
            for (int j = 0; j < r; j++) {
                rightArr[j] = arr[l + j];
            }

            sort(leftArr);
            sort(rightArr);
            merge(leftArr, rightArr, arr);
        }
        
    }

    private void merge(int[] leftArr, int[] rightArr, int[] arr) {

        int p = leftArr.length, q = rightArr.length;
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // left array end first, copy the left right elements to arr
        while (j < q) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

        // right array end first, copy the left left elements to arr
        while (i < p) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
    }

}