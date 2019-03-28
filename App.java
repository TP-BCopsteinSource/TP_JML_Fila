public class App{
  public static void main(String args[]){
    IFila f = new Fila();

    //f.dequeue();
    for(int i=0;i<10;i++){
      f.enqueue(i);
    }
    for(int i=0;i<10;i++){
      int val = f.dequeue();
      System.out.println(val);
    }
  }
}
