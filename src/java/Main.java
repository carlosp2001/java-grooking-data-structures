import unsortedarray.UnsortedIntArray;
import unsortedarray.UnsortedObjectArray;
import unsortedarray.utils.UnsortedArrayUtils;

public class Main {
    public static void main(String[] args) {
        UnsortedObjectArray<Integer> unsortedObjectArray = new UnsortedObjectArray<>(6);
        unsortedObjectArray.insert(5);
        System.out.println(unsortedObjectArray.size());

        UnsortedIntArray unsortedIntArray = new UnsortedIntArray(10);
        unsortedIntArray.insert(5);
        unsortedIntArray.insert(10);
        unsortedIntArray.insert(3);
        unsortedIntArray.delete(0);
        unsortedIntArray.insert(25);
        unsortedIntArray.insert(1);
        System.out.println(unsortedIntArray.find(10));
        System.out.println(unsortedIntArray.get(1));

        // Finding the max index
        System.out.println(UnsortedArrayUtils.maxInArray(unsortedIntArray));

        // Finding the max and min
        int[] maxAndMinIndexes = UnsortedArrayUtils.maxAndMinArray(unsortedIntArray);
        System.out.println("Max number index: " + maxAndMinIndexes[0] + " Min number index: " + maxAndMinIndexes[1]);
    }
}
