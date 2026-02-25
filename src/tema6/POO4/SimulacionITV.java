package tema6.POO4;

import tema6.Camion;
import tema6.Ciclomotor;
import tema6.Turismo;
import tema6.Vehiculo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulacionITV {
    private static List<RegistroITV> registros = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        // Simulación de 10 segundos
        for (int i = 0; i < 10; i++) {
            Transporte transporte = generarTransporteAleatorio();
            LocalDateTime momentoEntrada = LocalDateTime.now();
            registros.add(new RegistroITV(momentoEntrada, transporte));
            System.out.println("Nuevo transporte registrado: " + registros.get(registros.size() - 1));

            // Espera de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Simulación finalizada. Registros:");
        for (RegistroITV registro : registros) {
            System.out.println(registro);
        }
    }

    private static Transporte generarTransporteAleatorio() {
        int tipo = random.nextInt(5);
        switch (tipo) {
            case 0:
                return new Turismo("vehiculo", "Toyota", "Corolla", 2020, 5, "particular");
            case 1:
                return new Camion("vehivulo", "Volvo", "FH16", 2019, 44000, true);
            case 2:
                return new Ciclomotor("vehiculo", "Honda", "CBR", 2021, 150);
            case 3:
                return new Avion("Boeing 737", "Airline X", 180);
            case 4:
                return new Barco("Titanic", "Crucero", 52310);
            default:
                return null;
        }
    }
}