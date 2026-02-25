package tema5;

public class SimulacionNido {

    public static void main(String[] args) throws InterruptedException {
        NidoSerpientes nido = new NidoSerpientes();

        int duracionSegundos = 5 * 60; // 5 minutos = 300 segundos

        for (int segundo = 1; segundo <= duracionSegundos; segundo++) {
            System.out.println("\n===== SEGUNDO " + segundo + " =====");

            // Cada 5 segundos nacen serpientes
            if (segundo % 5 == 0) {
                nido.nacimientoPeriodico();
            }

            // Cada segundo viven las serpientes (sin mangosta individual)
            nido.vivirUnSegundo();

            // Cada 10 segundos aparece una mangosta en el nido
            if (segundo % 10 == 0) {
                nido.mangostaEnNido();
            }

            // Mostrar estado del nido cada segundo
            nido.mostrarEstado();

            Thread.sleep(1000); // 1 segundo de simulación
        }

        System.out.println("La simulación del nido ha terminado.");
    }
}

