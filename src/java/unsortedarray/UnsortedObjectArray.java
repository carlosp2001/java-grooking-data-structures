package unsortedarray;

public class UnsortedObjectArray<T> {
    private int size = 0;
    private final T[] array;

    public UnsortedObjectArray(int maxSize) {
        array = (T[]) new Object[maxSize];
    }

    public void insert(T element) {
        if (size < array.length) {
            array[size++] = element;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        }
    }

    public T get(int index) {
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
