 
import java.util.*;

public class Questao01{
   
 /*
    public void insereAntesDe(Object valorItem, Object elemento) {
      if (primeira != ultima) {
         CCelula aux = primeira;
         boolean achou = false;
         while (aux.prox != null && !achou) {
            achou = aux.prox.item.equals(elemento);
            if (!achou)
               aux = aux.prox;
         } 
         if (achou) {
            aux.prox = new CCelula(valorItem, aux.prox);
            qtde++;
         } 
      } 
   }
*/
   
   /*
      Metodo que preenche a lista com elementos de 1 a 10
   */   
   public static void preencheLista(CLista l){
      int a = 0;
      for(int i=0; i<10; i++){
         l.insereComeco(++a);
      }
   }
   
   public static void main (String [] args){
      CLista l = new CLista();
      preencheLista(l);
      l.imprimeFormatoLista();
      l.insereAntesDe(1000,5);
      l.imprimeFormatoLista();
   }
}