public class LLDeque implements Deque<T>{
    
    public LLNode<T> first, last;
    public int size;
    
    public LLDeque() {
	first = null;
	last = null;
	size = 0;
    }
    
    public void addLast (T node) {
	last.setNext(node);
	last = node;
    }
    public void removeFirst() {
	first = first.getNext();
    }
    public int size() {
	return size;
    }
    public T peekFirst() {
	return first._cargo;
    }
    public T peekLast() {
	return last._cargo;
    }
    public boolean isEmpty() {
	return size == 0;
    }
    public static void main(String[] args) {

    }
}

    
	
