import java.util.Scanner;

public class SomaConj{
  Scanner prompt = new Scanner(System.in);
  int n, num, sum= 0, i=0;
  public void Somar(){
    System.out.println("Quantos número serem somados?");
    int n = prompt.nextInt();
    while(i < n){
      i = i + 1;
      System.out.println("Entre com o "+i+"º número");
      int num = prompt.nextInt();
      sum = sum + num;
    }
    System.out.println("A soma dos números: "+ sum);
  }
}