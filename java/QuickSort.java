import java.util.Scanner;

public class QuickSort{
  Scanner prompt = new Scanner(System.in);
  
  public void DoQuickSort(){
    
    System.out.println("Digite o tamanho do vetor: ");
    int n = prompt.nextInt();
    int[] vetor = new int[n];
    for(int i = 0; i < n; i++){
      System.out.println("Digite o valor da "+ i + "º pos.");
      vetor[i] = prompt.nextInt();
    }

    for (int j = 0; j < n - 1; j++) {
      for (int i = 0; i < n - 1 - j; i++) {
        if (vetor[i] > vetor[i + 1]) {
          int aux = vetor[i];
          vetor[i] = vetor[i + 1];
          vetor[i + 1] = aux;
        }
      }
    }

    System.out.println("After QuickSort");
    for (int i = 0; i < n; i++){
      System.out.println(vetor[i]);
    }
  }
}
