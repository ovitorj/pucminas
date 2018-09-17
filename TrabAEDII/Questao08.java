import java.util.*;

public class Questao08{
/*
   public int primeiraOcorrenciaDe(Object elemento){
      boolean achou = false;
      int posicao = 0;
      for (CCelulaDup aux = primeira.prox; aux != null && !achou; aux = aux.prox){
         achou = aux.item.equals(elemento);
         posicao++;
      }
      if(!achou){
         posicao = -1111;
      }   
      return posicao;
   }
*/

   public static void preencheLista(CListaDup l){
      int a = 0;
      for(int i=0; i<10; i++){
         l.insereFim(++a);
      }
   }
   
   public static void main (String [] args){
      CListaDup l = new CListaDup();
      preencheLista(l);
      l.imprime();
      System.out.println(l.primeiraOcorrenciaDe(15));
      
   }
}


