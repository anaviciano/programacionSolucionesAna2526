package tema2;

import java.util.Scanner;

public class Exercise30ConParada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado; //en la wiki he descubierto que si quiero añadir varias variables de un mismo tipo puedo hacerlo usando comas.
        char operacion;
        String input;

        System.out.println("Bienvenido a la calculadora. Escribe 'exit' para salir en cualquier momento.");

        while (true) {
            System.out.print("Introduce el primer número: ");
            input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número o 'exit'.");
                continue;
            }

            System.out.print("Introduce la operación (+, -, *, /, %): ");
            input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            if (input.length() != 1) {
                System.out.println("Operación no válida.");
                continue;
            }
            operacion = input.charAt(0);

            System.out.print("Introduce el segundo número: ");
            input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                num2 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número o 'exit'.");
                continue;
            }

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        resultado = num1 % num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: Módulo por cero.");
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    break;
            }
        }
        System.out.println("Calculadora cerrada.");
        sc.close();
    }
}
