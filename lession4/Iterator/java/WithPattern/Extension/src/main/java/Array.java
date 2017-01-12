import java.lang.*;


/**
 * Created by Administrator on 2017/1/9.
 */
public class Array implements Iterable {
    private Object[] array;


    public Array(Object[] array) {
        this.array = array;
    }


    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {

        private int currentIndex = -1;
        private Array array;

        public ArrayIterator(Array array) {
            this.array = array;
        }

        public boolean hasNext() {
            return currentIndex + 1 < array.array.length;
        }

        public Object next() {
            return array.array[++currentIndex];
        }
    }
}
