import java.util.Scanner;

public class Contagem {
  Scanner prompt = new Scanner(System.in);
  int n, nota, cont = 0, i=0; 
  public void Conte(){
    System.out.println("Digite o número de notas: ");
    int n = prompt.nextInt();

      while(i < n){
        i = i + 1;
        System.out.println("Nota do aluno"+i);
          int nota = prompt.nextInt();
          if(nota >= 50){
            cont = cont+1;
          }
      }
      System.out.println("São "+ n +" Alunos");
      System.out.println("Tem "+ cont +" Aprovados");
  }
}
