interface IFila {
  /*@
	  @ instance initially isEmpty() == true;
		@*/

	//@ requires !isFull();
	//@ ensures size()==\old(size())+1;
	//@ ensures last()==v;
	public void enqueue(int v);

	//@ requires !isEmpty();
	//@ ensures size()==\old(size())-1;
	//@ ensures \result==\old(first());
	public int dequeue();

	//@ requires !isEmpty();
	public/*@ pure @*/int first();

	//@ requires !isEmpty();
	public/*@ pure @*/int last();

	//@ ensures \result >= 0;
	public/*@ pure @*/int size();

  //@ ensures size() >  0 ==> \result == false;
	//@ ensures size() == 0 ==> \result == true;
	public/*@ pure @*/boolean isEmpty();

	public/*@ pure @*/boolean isFull();
}
