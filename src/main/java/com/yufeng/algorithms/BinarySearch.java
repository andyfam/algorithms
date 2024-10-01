package com.yufeng.algorithms;

public class BinarySearch {
    public int runBinarySearchIteratively(
            int[] sortedArray, int key) {
        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = sortedArray.length - 1;

        if (high < 0) {
            return index;
        }

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;

    }
}
