package unsortedarray.utils;

import unsortedarray.UnsortedIntArray;

public class UnsortedArrayUtils {

    public static int maxInArray(UnsortedIntArray unsortedArray) {
        if (unsortedArray == null) throw new RuntimeException("Null value invalid");
        if (unsortedArray.size() == 0) {
            throw new RuntimeException("Array is empty");
        }
        int max_index = 0;
        for (int i = 0; i < unsortedArray.size(); i++) {
            if (unsortedArray.get(i) > unsortedArray.get(max_index)) {
                max_index = i;
            }
        }
        return max_index;
    }

    public static int[] maxAndMinArray(UnsortedIntArray unsortedArray) {
        if (unsortedArray == null) throw new RuntimeException("Null value invalid");
        if (unsortedArray.size() == 0) {
            throw new RuntimeException("Array is empty");
        }
        int max_index = 0;
        int min_index = 0;
        for (int i = 0; i < unsortedArray.size(); i++) {
            if (unsortedArray.get(i) > unsortedArray.get(max_index)) {
                max_index = i;
            }
            if (unsortedArray.get(i) < unsortedArray.get(min_index)) {
                min_index = i;
            }
        }
        return new int[]{max_index, min_index};
    }
}
