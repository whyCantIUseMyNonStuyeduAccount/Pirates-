public class LLNode 
{

    private String _cargo;    
    private LLNode _nextNode; 

    public LLNode( String value, LLNode next ) 
    {
  	_cargo = value;
  	_nextNode = next;
    }


    public String getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }
 
    public String setCargo( String newCargo ) 
    {
	  String foo = getCargo();
	  _cargo = newCargo;
	  return foo;
    }

    public LLNode setNext( LLNode newNext ) 
    {
	  LLNode foo = getNext();
	  _nextNode = newNext;
	  return foo;
    }

    public String toString() { return _cargo.toString(); }

}//end class LLNode
