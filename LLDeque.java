public class LLDeque<T> implements Deque<T>{
    
    public LLNode<T> first, last;
    public int size;
    
    public LLDeque() {
	first = null;
	last = null;
	size = 0;
    }
    
    public void addLast (T node) {
	LLNode nnode = new LLNode(node, null);
	last.setNext(nnode);
	last = nnode;
    }
    public void removeFirst() {
	first = first.getNext();
    }
    public int size() {
	return size;
    }
    public T peekFirst() {
	return first.getValue();
    }
    public T peekLast() {
	return last.getValue();
    }
    public boolean isEmpty() {
	return size == 0;
    }
    public static void main(String[] args) {

    }
}

    
	
