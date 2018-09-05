import java.util.*;

public class Questao08{

  /*
      Método na classe Pilha para limpar a pilha
         
      public void limpa(){
         while(topo != null){
            topo = topo.prox;
            qtde--;
          }
   */

   public static void main (String [] args){
      CPilha p = new CPilha();
      
      int a=0;
      //for para preencher a pilha com 10 elementos
      for(int i=0; i<10; i++){
         p.empilha(++a);
      }
      
      p.limpa();
      System.out.println(p.peek());
      System.out.println(p.quantidade());
   }
}