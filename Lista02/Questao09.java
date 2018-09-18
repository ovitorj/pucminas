import java.util.*;
import java.util.Random;

public class Questao09{
   
   public static CLista criaCLista (int opcao, int n){
      CLista l =new CLista();
      int max = 100;
      int min = 0;
      Random r = new Random();
      
      if (opcao == 0){
         for(int i=0; i<n; i++)
            l.insereFim(i);
      }
      else{
         if(opcao == 1){
            for(int i=0; i<n; i++)
               l.insereComeco(i);
         }
         else if(opcao == 2){
            int randomNum;
            for(int i=0; i<n; i++){
               randomNum = r.nextInt((max-min)+1)+min;
               l.insereComeco(randomNum);
            }
         }
      }
      return l;
   }
   
   public static CFila criaCFila (int opcao, int n){
      CFila f =new CFila();
      int max = 100;
      int min = 0;
      Random r = new Random();
      
      if (opcao == 0){
         for(int i=0; i<n; i++)
            f.enfileira(i);
      }
      else{
         if(opcao == 1){
            for(int i=n; i>=0; i--)
               f.enfileira(i);
         }
         else if(opcao == 2){
            int randomNum;
            for(int i=0; i<n; i++){
               randomNum = r.nextInt((max-min)+1)+min;
               f.enfileira(randomNum);
            }
         }
      }
   
      return f;
   }
   
   public static CPilha criaCPilha (int opcao, int n){
      CPilha p = new CPilha();
      int max = 100;
      int min = 0;
      Random r = new Random();
      
      if (opcao == 0){
         for(int i=0; i<n; i++)
            p.empilha(i);
      }
      else{
         if(opcao == 1){
            for(int i=n; i>=0; i--)
               p.empilha(i);
         }
         else if(opcao == 2){
            int randomNum;
            for(int i=0; i<n; i++){
               randomNum = r.nextInt((max-min)+1)+min;
               p.empilha(randomNum);
            }
         }
      }
   
      return p;
   }
   
   public static void imprimePilha(CPilha p){
      int qtde = p.quantidade();
      for(int i=0; i<qtde; i++){
         System.out.println(p.desempilha());
      }
   }
      
   public static void main (String []args){
      CLista testeA;
      CFila testeQ;
      CPilha testeS;
     
     
     // Gera uma CLista aleatória com 400 alementos
      testeA = criaCLista(2,400);
      testeA.imprimeFormatoLista();
     
     // Gera uma CFila com 250 elementos em ordem crescente
      testeQ = criaCFila(0, 250);
      testeQ.mostra();
     
      testeS = criaCPilha(1,20);
   
   }
}