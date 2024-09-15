import java.util.Scanner;

public class Fibonacci{
  int n, a =0 , b=1, i=2;
  Scanner prompt = new Scanner(System.in);
  public void DoFibonacci(){
    System.out.println("Escreva o número de termos da sequência de Fibonacci");
    int n = prompt.nextInt();
    while(n > i){
      System.out.println(a + " , " + b + " , ");
      a = a + b; 
      b = a + b;
      i = i + 2;
    }
    if( n == i ){
      System.out.println(a + " , " + b);
    }else{
      System.out.println(a);
    }
  }
}