public class DLLDeque<T> implements Deque<T>{
    
    //add removeLast(), if the thing exists and where it exists, other stuffs	
	
    public DLLNode<T> first, last;
    public int size;
    
    public DLLDeque() {
	first = new DLLNode<T>(null, null, null);
	last = new DLLNode<T>(null, null, null);
	size = 0;
    }   
    
    public void addFirst(T node){
	first.setPrev(new DLLNode(node, null, first));
	first = first.getPrev();  
	size++;
    }
	
    public void addLast (T node) {
	last.setNext(new DLLNode(node, last, null));
	last = last.getNext();
	size++;
    }
    
    public T removeFirst() {
	size--;
	first = first.getNext();	
	return first.setPrev(null).getCargo();
    }

    public T removeLast(){
	size--;
	last = last.getPrev();
	return last.setNext(null).getCargo();
    }
	
    public int size() {
	return size;
    }
    
    public T peekFirst() {
	return first.getCargo();
    }
    
    public T peekLast() {
	return last.getCargo();
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

    
	
