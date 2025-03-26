import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matemática math = new Matemática();

        System.out.println("Escolha um número: ");
        math.escolha1 = sc.nextDouble();

        System.out.println("Escolha outro número: ");
        math.escolha2 = sc.nextDouble();

        System.out.println("Escolha sua operação: ");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Divisão");
        System.out.println("4.Multiplicação");

        int operacao = sc.nextInt();

        if (operacao == 1){
            System.out.println(math.soma());
        }
        else if (operacao == 2){
            System.out.println(math.subtracao());
        }
        else if (operacao == 3){
            System.out.println(math.divisao());
        }
        else if (operacao == 4){
            System.out.println(math.multiplicacao());
        }
        else {
            System.out.printl("Escolha invalida, por favor escolha uma das opções acima")
            }
        }
    }
