import java.util.*;

public class Questao09{

   public static void questao09(CFila f){
      int qdte= f.quantidade();
      
      for(int i=0; i<qdte; i++){
         f.desenfileira();
      }
      
   }//endQuestao09
   
   public static void main (String [] args){
      CFila f = new CFila();
      int a=0;
      //for para preencher a fila com 10 elementos
      for(int i=0; i<10; i++){
         f.enfileira(++a);
      }
         
      questao09(f);
      
      System.out.println(f.peek());
   }

}//questao09
