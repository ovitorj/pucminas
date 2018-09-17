import java.util.*;

public class Questao18{

   public static void invertePilha(CPilha p){
      int qtde = p.quantidade();
      CFila f = new CFila();
      for(int i=0; i<qtde; i++){
         f.enfileira(p.desempilha());
      }
      
      for(int i=0; i<qtde; i++){
         p.empilha(f.desenfileira());
      }
   
   }
   
   public static void preenchePilha(CPilha p){
      int a = 0;
      for(int i=0; i<10; i++){
         p.empilha(++a);
      }
   }
   
   public static void main (String [] args){
      CPilha p = new CPilha();
      preenchePilha(p);
      System.out.println(p.peek());
      invertePilha(p);
      System.out.println(p.peek());
   }
}