package tema5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class NidoSerpientes {

    private static final int MAX_SERPIENTES = 20;
    private static final Random random = new Random();

    private List<Serpiente> serpientes;

    public NidoSerpientes() {
        this.serpientes = new ArrayList<>();
    }

    public int getNumeroSerpientes() {
        return serpientes.size();
    }

    public void nacimientoPeriodico() {
        // Cada 5 segundos nacen entre 1 y 3 serpientes, si hay hueco
        int nacen = 1 + random.nextInt(3); // 1..3
        int posibles = MAX_SERPIENTES - serpientes.size();
        if (posibles <= 0) {
            System.out.println("El nido está lleno, no caben más serpientes.");
            return;
        }
        int reales = Math.min(nacen, posibles);
        System.out.println("Nacen " + reales + " serpiente(s) en el nido.");
        for (int i = 0; i < reales; i++) {
            Serpiente s = new Serpiente();
            serpientes.add(s);
            System.out.println("  Nueva serpiente con cuerpo: " + s.getCuerpo());
        }
    }

    /**
     * Un segundo de vida del nido: cada serpiente vive un año SIN mangosta.
     */
    public void vivirUnSegundo() {
        if (serpientes.isEmpty()) {
            System.out.println("El nido está vacío este segundo.");
            return;
        }

        System.out.println("Las serpientes viven un año...");
        Iterator<Serpiente> it = serpientes.iterator();
        while (it.hasNext()) {
            Serpiente s = it.next();
            String desc = s.vivirUnAnioSinMangosta();
            System.out.println("  " + desc);
            if (!s.estaViva()) {
                System.out.println("  -> Esta serpiente ha muerto y se retira del nido.");
                it.remove();
            }
        }
    }

    /**
     * Mangosta en el nido cada 10 segundos:
     * el 20% de las veces se come entre 0 y 4 serpientes.
     */
    public void mangostaEnNido() {
        if (serpientes.isEmpty()) {
            System.out.println("La mangosta aparece, pero el nido está vacío.");
            return;
        }

        double p = random.nextDouble();
        if (p < 0.20) {
            int maxComer = Math.min(4, serpientes.size());
            int cuantas = random.nextInt(maxComer + 1); // 0..maxComer
            System.out.println("Una mangosta aparece y se come " + cuantas + " serpiente(s).");
            for (int i = 0; i < cuantas && !serpientes.isEmpty(); i++) {
                // Para simplificar, se come la última
                Serpiente comida = serpientes.remove(serpientes.size() - 1);
                System.out.println("  Mangosta se come una serpiente con cuerpo: " + comida.getCuerpo());
            }
        } else {
            System.out.println("Aparece una mangosta, pero no come ninguna serpiente.");
        }
    }

    public void mostrarEstado() {
        System.out.println("=== Estado del nido ===");
        System.out.println("Número de serpientes: " + serpientes.size());
        int i = 1;
        for (Serpiente s : serpientes) {
            System.out.println("  #" + i + " -> " + s.toString());
            i++;
        }
        System.out.println("=======================");
    }
}

