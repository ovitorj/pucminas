import java.util.*;

public class Questao03{
   
   public static void questao03(){
   
   //definicao das variaveis
      CPilha p = new CPilha();
      CPilha paux = new CPilha();
      CPilha paux1 = new CPilha();
      int quantidade=10;
      int a = 0;
   
   //for para preencher a Pilha p
      for(int i=0; i<quantidade;i++)
         p.empilha(a++);
   
   //for para passar os elementos de p para a pilha paux
      for(int i=0; i<quantidade; i++)
         paux.empilha(p.desempilha());
   
   //for para passar os elementos de paux para paux1   
      for(int i=0; i<quantidade; i++)
         paux1.empilha(paux.desempilha());
         
   //for para retornar os elementos para p
      for(int i=0; i<quantidade; i++)
         p.empilha(paux1.desempilha());
               
      System.out.println("[ "+p.peek()+" ]");  
   
   }//end questao03
   
   public static void main (String [] args){
      questao03();
   }//end class
}