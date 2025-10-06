package tema1;
import java.util.Scanner;

public class Ejercicio6 {


        public static void main(String[] args) {
            final double PI = 3.14;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escribe el valor del radio: ");
            double radius = scanner.nextDouble();
            double area = PI * radius * radius;
            //double area2 = Math.PI * Math.pow(radius, 2);
            System.out.println("El área es " + area);
        }

}
