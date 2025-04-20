import unsortedarray.UnsortedIntArray;
import unsortedarray.UnsortedObjectArray;

public class Main {
    public static void main(String[] args) {
        UnsortedObjectArray<Integer> unsortedObjectArray = new UnsortedObjectArray<>(6);
        unsortedObjectArray.insert(5);
        System.out.println(unsortedObjectArray.size());
        UnsortedIntArray unsortedIntArray = new UnsortedIntArray(10);
        unsortedIntArray.insert(5).insert(10).insert(3).delete(0);
    }
}
