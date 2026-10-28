import java.util.Scanner;

public class MediaAprovacao {
  public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

    String nome;
    double nota1, nota2, nota3;

    System.out.print("Digite o nome do Aluno(a): ");
    nome = tc.nextLine();
    System.out.print("Primaira nota: ");
    nota1 = tc.nextDouble();
    System.out.print("Segunda nota: ");
    nota2 = tc.nextDouble();
    System.out.print("Terceira nota: ");
    nota3 = tc.nextDouble();

    double media = (nota1 + nota2 + nota3) / 2;

    if(media >= 7) {
      System.out.print("Media " + media + ". Aluno Aprovado(a)!");
    }else{
      System.out.print("Media " + media + ". Aluno Reprovado(a)!");
    } 
  }
}