import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class GenericStorage<T extends Comparable<T>> implements Iterable<T> {
    private ArrayList<T> data;

    public GenericStorage() {
        data = new ArrayList<>();
    }

    public void add(T element) {
        data.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements ListIterator<T> {
        private int currentIndex;
        private T firstElement;

        public CustomIterator() {
            if (data.isEmpty()) {
                throw new NoSuchElementException("The data storage is empty.");
            }
            currentIndex = 0;
            firstElement = data.get(0);
        }

        @Override
        public boolean hasNext() {
            for (int i = currentIndex; i < data.size(); i++) {
                if (data.get(i).compareTo(firstElement) >= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public T next() {
            while (currentIndex < data.size()) {
                T element = data.get(currentIndex++);
                if (element.compareTo(firstElement) >= 0) {
                    return element;
                }
            }
            throw new NoSuchElementException("No more elements that satisfy the condition.");
        }

        @Override
        public boolean hasPrevious() {
            for (int i = currentIndex - 1; i >= 0; i--) {
                if (data.get(i).compareTo(firstElement) >= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public T previous() {
            while (currentIndex > 0) {
                T element = data.get(--currentIndex);
                if (element.compareTo(firstElement) >= 0) {
                    return element;
                }
            }
            throw new NoSuchElementException("No more elements that satisfy the condition.");
        }

        @Override
        public int nextIndex() {
            return currentIndex;
        }

        @Override
        public int previousIndex() {
            return currentIndex - 1;
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


