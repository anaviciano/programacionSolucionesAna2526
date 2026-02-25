package tema6.POO4;

import java.util.Random;

public class Bardo implements ICombatiente {
    private int vida;
    private Random random;

    public Bardo(int vida) {
        this.vida = vida;
        this.random = new Random();
    }

    @Override
    public Ataque atacar() {
        int danoFisico = random.nextInt(10) + 1;
        int danoMagico = random.nextInt(10) + 1;
        String tipoAtaque = random.nextInt(100) < 50 ? "cuerpo a cuerpo" : "a distancia";
        if (random.nextInt(100) < 10) {
            danoFisico = danoMagico = Integer.MAX_VALUE; // Ataque crítico
        }
        return new Ataque(danoFisico, danoMagico, tipoAtaque);
    }

    @Override
    public void defender(Ataque ataque) {
        int danoRecibido = ataque.getDanoFisico() + ataque.getDanoMagico();
        vida -= danoRecibido;
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
}
