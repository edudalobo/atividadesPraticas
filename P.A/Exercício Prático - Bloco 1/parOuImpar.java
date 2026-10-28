import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args){
    Scanner tc = new Scanner(System.in);

    int numero;

    System.out.print("Digite um numero: ");
    numero = tc.nextInt();

    if(numero / 2 == 0) {
      System.out.println("Numero par!");
    }else{
      System.out.println("Numero Impar!");
    }
    
  }
}