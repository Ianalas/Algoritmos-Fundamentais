import java.util.Scanner;

public class PrimoNum{
  int n, cont=0;
  Scanner prompt = new Scanner(System.in);
  public void DoPrimeNum(){
    System.out.println("Digite o número para verificar se é primo: ");
    int n = prompt.nextInt();
    if(n>0){
      for(int i = 1; i <= n; i++){
        if(n % i == 0){
          cont = cont + 1;
        }
      }
    }
    if(cont == 2){
      System.out.println("O número "+n+" é primo");
    }else{
      System.out.println("O número "+n+" não é primo");
    }
  }
}