package tema6.POO4;

public class SimulacionCombate {
    public static void main(String[] args) {
        ICombatiente berserker = new Berserker(100);
        ICombatiente mago = new Mago(100);
        ICombatiente bardo = new Bardo(100);
        ICombatiente guerrero = new Guerrero(100);
        ICombatiente druida = new Druida(100, 50);

        // Simulación de combate entre Berserker y Mago
        while (berserker.estaVivo() && mago.estaVivo()) {
            Ataque ataqueBerserker = berserker.atacar();
            Ataque ataqueMago = mago.atacar();

            mago.defender(ataqueBerserker);
            berserker.defender(ataqueMago);

            System.out.println("Berserker ataca con " + ataqueBerserker.getDanoFisico() + " daño físico.");
            System.out.println("Mago ataca con " + ataqueMago.getDanoMagico() + " daño mágico.");

            if (!mago.estaVivo()) {
                System.out.println("¡El Berserker ha derrotado al Mago!");
            } else if (!berserker.estaVivo()) {
                System.out.println("¡El Mago ha derrotado al Berserker!");
            }
        }
    }
}
