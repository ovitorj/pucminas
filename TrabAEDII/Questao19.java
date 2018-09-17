import java.util.*;
public class Questao19{
   
   public static void inverteFila(CFila f){
      CPilha p = new CPilha();
      int qtde = f.quantidade();
      for (int i=0; i<qtde; i++){
         p.empilha(f.desenfileira());
      }
      
      for(int i=0; i<qtde; i++){
         f.enfileira(p.desempilha());
      }
   }
   
   public static void preencheFila(CFila f){
      int a = 0;
      for(int i=0; i<10; i++){
         f.enfileira(++a);
      }
   }
   
   public static void main (String [] args){
      CFila f = new CFila();
      preencheFila(f);
      System.out.println(f.peek());
      inverteFila(f);
      System.out.println(f.peek());
   }

}