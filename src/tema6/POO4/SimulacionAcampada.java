package tema6.POO4;

import tema6.Animal;
import tema6.Gato;
import tema6.Pajaro;
import tema6.Perro;

import java.util.Random;

public class SimulacionAcampada {
    private static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            Animal animal = generarAnimalAleatorio();
            animal.hacerRuido();

            int probabilidad = random.nextInt(100);
            if (probabilidad < 5) {
                System.out.println("¡El animal nos ha atacado! ¡Tenemos que salir huyendo!");
                break;
            } else {
                System.out.println("El animal se ha ido y se ha quedado dormido.");
            }

            // Espera de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static Animal generarAnimalAleatorio() {
        int tipo = random.nextInt(5);
        switch (tipo) {
            case 0:
                return new Perro();
            case 1:
                return new Gato();
            case 2:
                return new Pajaro();
                /*
            case 3:
                return new Pez();
            case 4:
                return new Caballo();

                 */
            default:
                return null;
        }
    }
}
