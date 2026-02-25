package tema5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainColecciones {
    public static void main(String[] args) {

        //HASHSET
        Set<String> frutas = new HashSet<>();

        frutas.add("Manzana");

        frutas.add("Banana");

        frutas.add("Fresa");

        frutas.add("Kiwi");

        frutas.add("Manzana"); //Duplicado. No lanza error, solo lo ignora y lanza false​

        if (frutas.contains("Fresa")) {

            System.out.println("La fresa está en el conjunto");

        }

        frutas.remove("Kiwi");

        System.out.println("El conjunto de frutas contiene:");

        for (String fruta : frutas) {

            System.out.println(fruta);

        }

        System.out.println("Número de frutas: " + frutas.size());

        //LINKEDHASHSET
        //mantiene el orden de inserción
        Set<String> frutas2 = new LinkedHashSet<>();

        frutas2.add("Manzana");
        frutas2.add("Banana");
        frutas2.add("Fresa");
        frutas2.add("Kiwi");
        frutas2.add("Manzana"); // Duplicado, no se añade

        if (frutas2.contains("Fresa")) {
            System.out.println("La fresa está en el conjunto");
        }

        frutas2.remove("Kiwi");

        System.out.println("El conjunto de frutas contiene:");
        for (String fruta : frutas2) {
            System.out.println(fruta);
        }

        System.out.println("Número de frutas: " + frutas2.size());


        //TREESET
        //Ordena de manera ascendente

        Set<String> frutas3 = new TreeSet<>();

        frutas3.add("Manzana");
        frutas3.add("Banana");
        frutas3.add("Fresa");
        frutas3.add("Kiwi");
        frutas3.add("Manzana"); // Duplicado, no se añade

        if (frutas3.contains("Fresa")) {
            System.out.println("La fresa está en el conjunto");
        }

        frutas3.remove("Kiwi");

        System.out.println("El conjunto de frutas contiene:");
        for (String fruta : frutas3) {
            System.out.println(fruta);
        }

        System.out.println("Número de frutas: " + frutas3.size());

    }
}
