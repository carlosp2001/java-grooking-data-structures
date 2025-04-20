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

    public UnsortedIntArray delete(int index) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is already empty");
        } else if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        } else {
            array[index] = array[size - 1];
            array[size - 1] = 0;
            size--;
        }
        return this;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
    }

    public int size() {
        return size;
    }
}
