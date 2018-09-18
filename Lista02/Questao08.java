import java.util.*;

public class Questao08{

   public static Scanner in = new Scanner (System.in);
   
   public static void calculaOcorrencia (CFila f, int a){
      CFila f1 = new CFila();
      int qtde = f.quantidade();
      int aux;
      int achou=0;
      
      for(int i=0; i<qtde; i++){
         aux = (int)f.desenfileira();
         if (aux == a){
            achou++;}
         f1.enfileira(aux);
      }
      
      for(int i=0; i<qtde; i++){
         f.enfileira(f1.desenfileira());
      }
     
      System.out.println("Ocorrencia de ["+a+"] = "+achou);
   }
   
   public static void preenche (CFila f){
      System.out.println("Preencha a Lista");
      for (int i=0; i<10; i++){
         System.out.print(""+(i+1)+" = ");
         f.enfileira(in.nextInt());
      }
   }
   
   public static void main (String [] args){
      CFila f = new CFila ();
      preenche(f);
      calculaOcorrencia(f,5); 
   }

}