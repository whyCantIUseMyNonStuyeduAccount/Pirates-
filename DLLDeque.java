public class DLLDeque<T> implements Deque<T>{
    
    //add removeLast(), if the thing exists and where it exists, other stuffs	
	
    public DLLNode<T> first, last;
    public int size;
    
    public DLLDeque() {
	first = null;
	last = null;
	size = 0;
    }
    
    public void addFirst(T node){
	first = new DLLNode(node, first);    
	size++;
    }
	
    public void addLast (T node) {
	DLLNode nnode = new DLLNode(node, null);
	last.setNext(nnode);
	last = nnode;
	size++;
    }
    public void removeFirst() {
	first = first.getNext();
	size--;
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
	DLLDeque fred = new DLLDeque();
	System.out.println(fred.isEmpty());
	System.out.println(fred.size());
	fred.addFirst(1);
	fred.addFirst(2);
	fred.addLast(60);
	System.out.println(fred.isEmpty());
	System.out.println(fred.size());
	System.out.println(fred.peekFirst());
	System.out.println(fred.peekLast());
	fred.removeFirst();
	System.out.println(fred.isEmpty());
	System.out.println(fred.size());
    }
}

    
	
