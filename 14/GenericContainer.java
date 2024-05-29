import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class GenericContainer<T extends Comparable<T>> implements Iterable<T> {
    private List<T> data;
    
    public GenericContainer() {
        data = new ArrayList<>();
    }
    
    public void add(T element) {
        data.add(element);
    }
    
    @Override
    public Iterator<T> iterator() {
        return new GenericIterator(data);
    }
    
    private class GenericIterator implements ListIterator<T> {
        private List<T> list;
        private int index = 0;
        
        public GenericIterator(List<T> list) {
            this.list = list;
        }
        
        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }
        
        @Override
        public T next() {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            T element = list.get(index);
            index = (index + 1) % list.size();
            while (element.compareTo(list.get(0)) > 0) {
                index = (index + 1) % list.size();
                element = list.get(index);
            }
            return element;
        }
        
        @Override
        public boolean hasPrevious() {
            return !list.isEmpty();
        }
        
        @Override
        public T previous() {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            index = (index - 1 + list.size()) % list.size();
            T element = list.get(index);
            while (element.compareTo(list.get(0)) > 0) {
                index = (index - 1 + list.size()) % list.size();
                element = list.get(index);
            }
            return element;
        }
        
        @Override
        public int nextIndex() {
            return (index + 1) % list.size();
        }
        
        @Override
        public int previousIndex() {
            return (index - 1 + list.size()) % list.size();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void set(T t) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void add(T t) {
            throw new UnsupportedOperationException();
        }
    }
    
    
}
