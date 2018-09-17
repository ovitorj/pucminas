import java.util.*;

public class Questao02{
  
  /* Metodo na classe CLista
  
   public void insereDepoisDe(Object valorItem, Object elemento) {
   
      if (primeira != ultima) {
         CCelula aux = primeira;
         boolean achou = false;
         while (aux.prox != null && !achou) {
            achou = aux.prox.item.equals(elemento);
            if (!achou)
               aux = aux.prox;
         } 
         if (achou){
            if(aux.prox.prox == null){
               aux.prox.prox = new CCelula(valorItem);
               ultima = ultima.prox; 
            }
            else{
               aux.prox.prox = new CCelula(valorItem, aux.prox.prox);          
            }
            qtde++;
         }
      } 
   } 
   
      Metodo que preenche a lista com elementos de 1 a 10
   */   
   public static void preencheLista(CLista l){
      int a = 0;
      for(int i=0; i<10; i++){
         l.insereFim(++a);
      }
   }
   
   public static void main (String [] args){
      CLista l = new CLista();
      preencheLista(l);
      l.imprimeFormatoLista();
      l.insereDepoisDe(1000,10);
      l.imprimeFormatoLista();
   }
}
