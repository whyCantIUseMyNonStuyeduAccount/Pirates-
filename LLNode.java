public class LLNode<T> {

    private T _cargo;    
    private LLNode<T> _nextNode;
	
    public LLNode( T value, LLNode<T> next ) {
	_cargo = value;
	_nextNode = next;
    }


 
    public T getValue() { return _cargo; }

    public LLNode<T> getNext() { return _nextNode; }

    public T setValue( T newCargo ) {
	T foo = getValue();
	_cargo = newCargo;
	return foo;
    }

    public LLNode<T> setNext( LLNode<T> newNext ) {
	LLNode<T> foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public String toString() { return _cargo.toString(); }

}
