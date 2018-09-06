import java.util.*;

public class Questão10{

/* Método furaFila

  public void furaFila(Object item){
      frente.prox = new CCelula(item, frente.prox);
      if( frente.prox.prox == null)
         tras = frente.prox;
      qtde++;
   }

*/
   
   public static void questao10(){
      CFila f = new CFila ();
      int a = 0;
      //for para preencher a fila com 10 elementos
      for (int i=0; i<10; i++){
         f.enfileira(++a);
      }   
      
      f.furaFila(5);
      System.out.println(f.peek());
   }

   public static void main (String [] args){
      questao10();
   }

}