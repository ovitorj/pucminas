import java.util.*;

/*
   O erro gerado é:
   
   Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
 	at Questao03.soma(Questao03.java:28)
 	at Questao03.main(Questao03.java:44)
   
   pois há a tentativa de soma de tipos diferentes
*/

public class Questao03{
   
   public static Scanner in = new Scanner (System.in);
   
   public static void preenche (CLista l){
      System.out.println("Lista preenchida com tipos diferentes");
      l.insereFim(15);
      l.insereFim("Texto");
      l.insereFim('A');
      l.insereFim(false);
      l.insereFim(1);
      l.insereFim("Texto");
      l.insereFim('B');
      l.insereFim(true);
      l.insereFim(15);
      l.insereFim("Texto");
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
      soma(l);
   } 
}