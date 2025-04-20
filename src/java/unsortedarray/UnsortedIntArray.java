package unsortedarray;

public class UnsortedIntArray {
    private int size = 0;
    private final int[] array;

    public UnsortedIntArray(int maxSize) {
        array = new int[maxSize];
    }

    public UnsortedIntArray insert(int element) {
        if (size < array.length) {
            array[size++] = element;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
        return this;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public int size() {
        return size;
    }
}
