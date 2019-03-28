public class Fila implements IFila{
  private static final int MAX = 10;
  private int[] base;
  private int pos;

  public Fila(){
    base = new int[MAX];
    pos = 0;
  }

  public void enqueue(int v){
    base[pos] = v;
    pos++;
  }

	public int dequeue(){
    int aux = base[0];
    pos--;
    for(int i=0;i<pos;i++){
      base[i] = base[i+1];
    }
    return aux;
  }

	public/*@ pure @*/int first(){
    return base[0];
  }

	public/*@ pure @*/int last(){
    return base[pos-1];
  }

	public/*@ pure @*/int size(){
    return pos;
  }

	public/*@ pure @*/boolean isEmpty(){
    return (pos == 0);
  }

	public/*@ pure @*/boolean isFull(){
    return (pos == MAX);
  }
}
