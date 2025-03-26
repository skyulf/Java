import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        aluno Aluno1 = new aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        Aluno1.nome = sc.nextLine();

        System.out.println("Nota1: ");
        Aluno1.nota1 = sc.nextDouble();

        System.out.println("Nota2: ");
        Aluno1.nota2 = sc.nextDouble();

        System.out.println("Nota3: ");
        Aluno1.nota3 = sc.nextDouble();

        System.out.println("Media: "+ String.format("%.1f",Aluno1.media()));

        if (Aluno1.media() >= 7.0){
            System.out.println("Parabéns, "+ Aluno1.nome + " você foi aprovado!");
        }

        else if (Aluno1.media() <= 4.0){
        System.out.println("Você está reprovado!");
    }
        else {
            System.out.println("Você está na final!");
        }
        }
}