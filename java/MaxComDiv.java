import java.util.Scanner;

public class MaxComDiv{
  Scanner prompt = new Scanner(System.in);
  int a,b, div, maior;
  public void DoMDC(){
    System.out.println("Digite o 1º numerador: ");
    int a  = prompt.nextInt();
    System.out.println("Digite o 2º numerador: ");
    int b = prompt.nextInt();

    if(a>b){
      maior = a;
    }else{
      maior = b;
    }
    for (int i=1; i <= maior; i++){
        if(a%i == 0 && b%i == 0){
          div = i;
        }
    }
    System.out.println("O MDC é: "+div);
  }
}