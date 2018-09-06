import java.util.*;

public class Questao11{
   
   public static void furaFila(CFila f, Object item){
      //Definicao das variaveis
      int qtde = f.quantidade();
      CFila faux = new CFila();
     
      //for para preencher uma fila auxiliar com os valores de f
      for(int i=0; i<qtde; i++){
         faux.enfileira(f.desenfileira());
      }
      
      //enfileirar o item recebido
      f.enfileira(item);
      
      //for para voltar com os valores para f
      for(int i=0; i<qtde; i++){
         f.enfileira(faux.desenfileira());
      }
      
   }
   
   // preenche a fila com valores de 1 a 10
   public static void preenche(CFila f){
      int a=0;
      for(int i=0; i<10; i++){
         f.enfileira(++a);
      }
   }
   
   
   public static void main (String [] args){
      CFila f = new CFila();
      preenche(f);
      furaFila(f,50);
      System.out.println(f.peek());
   }
}