import java.util.*;

public class Questao02{
   
   public static Scanner in = new Scanner (System.in);
   
   public static void preenche (CFila f){
      System.out.println("Preencha a Lista");
      for (int i=0; i<10; i++){
         System.out.print(""+(i+1)+" = ");
         f.enfileira(in.nextInt());
      }
   }
   
   public static void soma (CFila f){
      int qtde = f.quantidade();
      int soma = 0;
      int aux = 0;
      CFila f1 = new CFila(); 
      
      for (int i=0; i<qtde; i++){
         aux = (int)f.desenfileira();
         f1.enfileira(aux);
         soma = aux + soma;
      }
      
      //for para voltar com os valores a Fila inicial
      for (int i=0; i<qtde; i++){
         f.enfileira(f1.desenfileira());
      }
      System.out.println("Soma = "+soma);
   }
   
   public static void main (String [] args){
      CFila f = new CFila();
      preenche(f);
      f.mostra();
      soma(f);
      f.mostra();
   }
   
}