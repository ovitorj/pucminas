import java.util.*;

public class Questao09{

/*
     public int ultimaOcorrenciaDe(Object elemento){
      boolean achou = false;
      int posicao = qtde+1;
      for (CCelulaDup aux = ultima; aux.ant != null && !achou; aux = aux.ant){
         achou = aux.item.equals(elemento);
         posicao--;
      }
      if(!achou){
         posicao = -1111;
      } 
      return posicao;
   }
*/   

   public static void preencheLista(CListaDup l){
      int a = 0;
      int b = 0;
      for(int i=0; i<10; i++){
         l.insereFim(++a);
      }
      for(int i=0; i<10; i++){
         l.insereFim(++b);
      }
   }
   
   public static void main (String [] args){
      CListaDup l = new CListaDup();
      preencheLista(l);
      l.imprime();
      System.out.println();
      System.out.println(l.ultimaOcorrenciaDe(2));
   }
}


