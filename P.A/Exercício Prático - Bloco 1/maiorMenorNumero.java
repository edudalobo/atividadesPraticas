import java.util.Scanner;
public class maiorMenorNumero {
  public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

    int numero1;
    int numero2;

    System.out.print("Digite o primeiro numero: ");
    numero1 = tc.nextInt();
    System.out.print("Digite o segundo numero: ");
    numero2 = tc.nextInt();

    if(numero1 > numero2) {
      System.out.println("Maior numero:" +numero1+ "\nMenor numero: " +numero2);
    }else if(numero1 < numero2) {
        System.out.println("Maior numero:" +numero2+ "\nMenor numero:" +numero1);
      }else{
        System.out.println("Os numeros são iguais!");
      }

    }

  }

