import java.util.*;

public class Questao06{

   public static Scanner in = new Scanner (System.in);
   
   public static void preencheLista (CLista l){
      System.out.println("Preencha a Lista");
      for (int i=0; i<10; i++){
         System.out.print(""+(i+1)+" = ");
         l.insereFim(in.nextInt());
      }
   }
   
   public static void preencheFila (CFila f){
      System.out.println("Preencha a Fila");
      for (int i=0; i<10; i++){
         System.out.print(""+(i+1)+" = ");
         f.enfileira(in.nextInt());
      }
   }
   
   public static void preenchePilha (CPilha p){
      System.out.println("Preencha a Pilha");
      for (int i=0; i<10; i++){
         System.out.print(""+(i+1)+" = ");
         p.empilha(in.nextInt());
      }
   }
   
   public static void soma (CLista l, CFila f, CPilha p){
   
      //Quantidades
      int qtde1 = l.quantidade();
      int qtde2 = f.quantidade();
      int qtde3 = p.quantidade();
      
      //armazenadores auxiliares
      int aux1, aux2, aux3 = 0;
      
      int soma = 0;
      
      //estruturas auxiliares
      CLista l1 = new CLista();
      CFila  f1 = new CFila();
      CPilha p1 = new CPilha();
      
      // Lista
      for (int i=0; i<qtde1; i++){
         aux1 = (int)l.removeRetornaComeco();
         l1.insereFim(aux1);
         soma = aux1 + soma;
      }
      
      //for para voltar com os valores a Lista inicial
      for (int i=0; i<qtde1; i++){
         l.insereFim(l1.removeRetornaComeco());
      }
   
      // Fila
      for(int i=0; i<qtde2; i++){
         aux2 = (int)f.desenfileira();
         f1.enfileira(aux2);
         soma = aux2 + soma;      
      }
      
      // for para voltar com os valores para a fila inicial
      for (int i=0; i<qtde2; i++){
         f.enfileira(f1.desenfileira());
      }
      
      //Pilha
      for (int i=0; i<qtde3; i++){
         aux3 = (int)p.desempilha();
         p1.empilha(aux3);
         soma = aux3 + soma; 
      }
      
      // for para voltar com os valores a pilha inicial
      for(int i=0; i<qtde3; i++){
         p.empilha(p1.desempilha());
      }
      
      System.out.println("Soma = "+soma);
   }
   

   public static void main (String [] args){
      CLista l = new CLista ();
      CFila f = new CFila ();
      CPilha p = new CPilha ();
      
      preencheLista(l);
      preencheFila(f);
      preenchePilha(p);
      
      soma(l,f,p);
   }
   
}