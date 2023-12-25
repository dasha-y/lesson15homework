import java.util.Arrays;
import java.util.Objects;

public class Collection<T> {
    private static final int CAPACITY = 5;
    private Object[] arr;
    private int size;
    public Collection() {
        arr = new Object[CAPACITY];
    }
    public Collection(int size) {
        arr = new Object[size];
    }
    public void add(T a){
        if (size == arr.length) {
            int newCapacity = arr.length+1;
            Object[] newArr = new Object[newCapacity];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size++] = a;

    }
    public void remove(T a){
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(a)) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(arr, i + 1, arr, i, numMoved);
                }
                arr[--size] = null;
                break;
            }
        }

    }
    public void getByID(int id){
        if(id >= arr.length || id<0) {
            System.out.println("Элемент с таким индексом отсутствует");
        } else{
            System.out.println(arr[id]);
        }

    }
    public boolean contains(T a){
        for (int i = 0; i < arr.length; i++) {
            if(a.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
    public void clean(){
        arr = new Object[CAPACITY];
        size = 0;

    }

    @Override
    public String toString() {
        return "Collection{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
