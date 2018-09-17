import java.util.*;

public class Questao05{
   /*
      Metodo que preenche a fila com elementos de 1 a 10
   */   
   public static void preencheFila(CFila f){
      int a = 0;
      for(int i=0; i<10; i++){
         f.enfileira(++a);
      }
   }
   
   public static CFila concatenaFila(CFila f1, CFila f2) {
      CFila c = new CFila();
      CFila aux1 = new CFila();
      CFila aux2 = new CFila();
      
      aux1 = f1;
      aux2 = f2;
      
      int qtdef1 = aux1.quantidade();
      int qtdef2 = aux2.quantidade();
      
      for (int i=0; i<qtdef1; i++){
         c.enfileira(aux1.desenfileira());
      }
      for (int i=0; i<qtdef2; i++){
         c.enfileira(aux2.desenfileira());
      }
      
      return c;
   }
   
   public static void imprimeFila(CFila f){
      int qtde = f.quantidade();
      CFila aux = new CFila ();
      for (int i=0; i<qtde; i++){
         System.out.println("["+f.peek()+"] ");
         aux.enfileira(f.desenfileira());
      }
      for (int i=0; i<qtde; i++){
         f.enfileira(aux.desenfileira());
      }
   }

   public static void main (String [] args){
      CFila f1 = new CFila();
      CFila f2 = new CFila();
      preencheFila(f1);
      preencheFila(f2);
      imprimeFila(concatenaFila(f1,f2));
   }
}