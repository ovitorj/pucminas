import java.util.Random;

public class Questao05{
   
   public static void questao05(){
   
      //definicao das variaveis
      CPilha p = new CPilha();
      CPilha paux = new CPilha();
      Random gerador = new Random();
      int Low = 10;
      int High = 100;
      int quantidade=10;
      int soma=0;
      int media=0;
      int empilha=0;
      
      //for para preencher a pilha de forma aleatória
      for(int i=0; i<quantidade; i++){
         empilha = (gerador.nextInt(High-Low)+Low);
         p.empilha(empilha);
         soma = empilha+soma;
      }
      
      //for para imprimir os valores passando para paux
      for(int i=0; i<quantidade; i++){
         System.out.println("[ "+p.peek()+" ]");
         paux.empilha(p.desempilha());
      }
      
      //for para voltar os valores a p
      for(int i=0; i<quantidade; i++){
         p.empilha(paux.desempilha());
      }  
      
      System.out.println("Soma  = "+soma);
      System.out.println("Media = "+(media=soma/quantidade)); 
      System.out.println();
   }
   
   public static void main (String [] args){
      questao05();
   }//endMain
}//endClass