import java.util.*;

public class Questao07{


   public static void limpaPilha(CPilha p){
    int qtde=p.quantidade();
    for(int i=0; i<qtde; i++){
         p.desempilha();
      }
   }

   public static void main (String [] args){
      CPilha p = new CPilha();
      int a = 0;
      
      //for para preencher a pilha com 10 itens
      for(int i=0; i<10; i++){
         p.empilha(++a);   
      }
      
      //chamar o metodo CPilha p
      limpaPilha(p);
      System.out.println(p.peek());
   }
   
}