import java.util.Random;

public class Questao04{
   
   public static void questao04(){
      //definicao das variaveis
      CPilha p = new CPilha();
      CPilha paux = new CPilha();
      Random gerador = new Random();
      int quantidade=10;
      
      //for para preencher a pilha com valores aleatorios
      for(int i=0; i<quantidade; i++){
         p.empilha(gerador.nextInt());
      }
      
   }
   public static void main (String [] args){
      questao04();
   }
}