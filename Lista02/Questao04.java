import java.util.*;

public class Questao04{

   public static Scanner in = new Scanner (System.in);
   
   public static void listaAluno(CLista c, Aluno a){
       
      c.insereFim(a.nome+a.matricula);
   }
   

   public static void main (String[]args){
      
      CLista c = new CLista();
      
      Aluno v = new Aluno("Joao Lucas", 1111);
      Aluno w = new Aluno("Maria Lucas", 2222);
      Aluno x = new Aluno("Felipe Lucas", 3333);
      Aluno y = new Aluno("Marcos Lucas", 4444);
      Aluno z = new Aluno("Vitor Lucas", 5555);
      
      listaAluno(c,v);
      listaAluno(c,w);
      listaAluno(c,x);
      listaAluno(c,y);
      listaAluno(c,z);
      c.imprimeFormatoLista();
   } 
}