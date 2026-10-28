import java.util.Scanner;

public class somaAritmetica {
  public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

    int numero1;
    int numero2;

    System.out.print("Digite o primeiro numero: ");
    numero1 = tc.nextInt();
    System.out.print("Digite o segundo numero: ");
    numero2 = tc.nextInt();

    double soma = (numero1 + numero2) / 2;

    System.out.println("Resultado da soma:" + soma);

  }
}