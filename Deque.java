public interface Deque<T>{

  public void addFirst(T x);
  
  public void addLast(T x);
  
  public void removeFirst();
  
  public void removeLast();
  
  public int size();
  
  public T peekFirst();
  
  public T peekLast();
  
}
  
  
  
