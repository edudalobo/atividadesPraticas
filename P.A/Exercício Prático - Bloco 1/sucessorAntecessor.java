import java.util.Scanner;

public class SucessorAntecessor {
  public static void main(String[] args){
    Scanner tc = new Scanner(System.in);

    int numero;

    System.out.print("Digite um numero inteiro: ");
    numero = tc.nextInt();

    int antecessor = numero - 1;
    int sucessor = numero + 1;

    if(numero < 0) {
      System.out.printf("Por favor, digite um numero positivo!");
    }else{
      System.out.printf("Numero digitado: " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " +sucessor);
    }
  }
}