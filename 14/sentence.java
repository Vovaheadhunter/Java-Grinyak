import java.util.Iterator;
import java.util.NoSuchElementException;

public class sentence implements Iterable<String> {
    private String sentence;

    public sentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public Iterator<String> iterator() {
        return new SentenceIterator(sentence);
    }

    private class SentenceIterator implements Iterator<String> {
        private String[] words;
        private int index = 0;

        public SentenceIterator(String sentence) {
            this.words = sentence.split("\s+");
        }

        @Override
        public boolean hasNext() {
            return index < words.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return words[index++];
        }
    }
}