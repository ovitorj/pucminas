import java.util.*;

public class Questao02{
   
   public static void questao02(){
   
      //definicao das variaveis 
      CPilha p = new CPilha();
      CPilha paux = new CPilha();
      int quantidade = 10;
      int a = 0;
      
      //for para preencher a pilha
      for(int i=0; i<quantidade; i++)
         p.empilha(a++);
         
      //for para enviar os valores de p para paux
      for(int i=0; i<quantidade; i++){
         paux.empilha(p.desempilha());
      }
         
      //for para imprimir os valores de forma invertida
      for(int i=0; i<quantidade; i++){
         System.out.println("[ "+paux.peek()+"]");
         p.empilha(paux.desempilha());
      }
   
   }//end questao02
   
   public static void main (String [] args){
      questao02();
   }//end main

}//end class