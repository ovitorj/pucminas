import java.util.*;

public class Questao01{
   
   public static Scanner in = new Scanner (System.in);
   
   public static void preenche (CLista l){
      System.out.println("Preencha a Lista");
      for (int i=0; i<10; i++){
         System.out.print(""+(i+1)+" = ");
         l.insereFim(in.nextInt());
      }
   }
   
   public static void soma (CLista l){
      int qtde = l.quantidade();
      int soma = 0;
      int aux = 0;
      CLista l1 = new CLista(); 
      
      for (int i=0; i<qtde; i++){
         aux = (int)l.removeRetornaComeco();
         l1.insereFim(aux);
         soma = aux + soma;
      }
      
      //for para voltar com os valores a Lista inicial
      for (int i=0; i<qtde; i++){
         l.insereFim(l1.removeRetornaComeco());
      }
      System.out.println("Soma = "+soma);
   }
   

   public static void main (String [] args){
      CLista l = new CLista();
      preenche(l);
      l.imprimeFormatoLista();
      soma(l);
      l.imprimeFormatoLista();
   } 

}