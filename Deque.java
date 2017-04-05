public interface Deque<T>{

    // Adds a node containing x as cargo to beginning of Deque
    public void addFirst(T x);
  
    // Adds a node containing x as cargo to end of Deque
    public void addLast(T x);

    // Removes a node from the beginning of Deque and returns its cargo
    public T removeFirst();

    // Removes a node from the end of Deque and returns its cargo
    public T removeLast();
    
    // Returns the size of the Deque
    public int size();
  
    // Returns cargo of the first node
    public T peekFirst();
  
    // Returns cargo of the last node
    public T peekLast();
  
}
  
  
  
