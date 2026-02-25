package tema6.POO4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleRoyale {
    private static List<ICombatiente> combatientes = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        // Crear 50 combatientes aleatorios
        for (int i = 0; i < 50; i++) {
            combatientes.add(generarCombatienteAleatorio());
        }

        // Simulación del Battle Royale
        while (combatientes.size() > 1) {
            int atacanteIndex = random.nextInt(combatientes.size());
            int defensorIndex = random.nextInt(combatientes.size());

            // Asegurarse de que el atacante y el defensor no sean el mismo
            while (atacanteIndex == defensorIndex) {
                defensorIndex = random.nextInt(combatientes.size());
            }

            ICombatiente atacante = combatientes.get(atacanteIndex);
            ICombatiente defensor = combatientes.get(defensorIndex);

            Ataque ataque = atacante.atacar();
            defensor.defender(ataque);

            System.out.println("Atacante: " + atacante.getClass().getSimpleName() + " ataca a " + defensor.getClass().getSimpleName() + " con " + ataque.getDanoFisico() + " daño físico y " + ataque.getDanoMagico() + " daño mágico.");

            // De la lista de combatientes, elimina aquellos que no esten vivos
            combatientes.removeIf(combatiente -> !combatiente.estaVivo());
        }

        // Anunciar el vencedor
        if (combatientes.size() == 1) {
            System.out.println("¡El vencedor es: " + combatientes.get(0).getClass().getSimpleName() + "!");
        } else {
            System.out.println("No hay vencedor.");
        }
    }

    private static ICombatiente generarCombatienteAleatorio() {
        int tipo = random.nextInt(5);
        switch (tipo) {
            case 0:
                return new Berserker(100);
            case 1:
                return new Mago(100);
            case 2:
                return new Bardo(100);
            case 3:
                return new Guerrero(100);
            case 4:
                return new Druida(100, 50);
            default:
                return null;
        }
    }
}
