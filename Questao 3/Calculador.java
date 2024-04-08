import java.util.Scanner;

class Calculadora {
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }
}

public class Calculador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = scanner.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = Calculadora.somar(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case 4:
                try {
                    resultado = Calculadora.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
