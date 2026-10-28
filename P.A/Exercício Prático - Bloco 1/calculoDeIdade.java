import java.util.Scanner;

public class CalculoDeIdade {
  public static void main(String[] args){
    Scanner tc = new Scanner(System.in);

    int anoNascimento;

    System.out.print("Digite o ano do seu nascimento: ");
    anoNascimento = tc.nextInt();

    int idade = 2026 - anoNascimento;

    if(idade < 0){
      System.out.println("Idade " + idade + "\n Voce nem nasceu ainda!");
    }else if(idade > 106) {
      System.out.println("Idade " + idade + "\n UM JURAAAAAAAAASSICO!!!!");
    }else{
      System.out.println("Sua idade é:" +idade);
    }
  }
}