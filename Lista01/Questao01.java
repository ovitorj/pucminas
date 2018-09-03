import java.util.*;

public class Questao01{
   
   public static void questao01(){
   
   // definição das variáveis
      CPilha p = new CPilha();
      CPilha paux = new CPilha();
      int quantidade=10;
      int a=0;
   
   //for para percorrer a fila e preechê-la
      for (int i=0; i<quantidade; i++)
         p.empilha(a++);
   
   //for para imprimir os valores da pilha empilhando-os em paux
      for (int i=0; i<quantidade; i++){
         System.out.println("[ "+p.peek()+"]");
         paux.empilha(p.desempilha());
      }
   
   //for para voltar os valores para a pilha p
      for(int i=0; i<quantidade; i++)
         p.empilha(paux.desempilha());
   
   
   }//end questao01

   public static void main (String [] args){
      questao01();
   }
   
}//end class