package tema6.POO4;

import java.util.Random;

public class Druida implements ICombatiente {
    private int vida;
    private int mana;
    private Random random;

    public Druida(int vida, int mana) {
        this.vida = vida;
        this.mana = mana;
        this.random = new Random();
    }

    @Override
    public Ataque atacar() {
        if (mana <= 0) {
            vida = 0; // Fallece si intenta atacar sin maná
        }
        int dano = random.nextInt(10) + 1;
        mana -= dano;
        return new Ataque(0, dano, "a distancia");
    }

    @Override
    public void defender(Ataque ataque) {
        mana -= ataque.getDanoMagico() + ataque.getDanoFisico();
        if (mana < 0) {
            mana = 0;
        }
        mana += random.nextInt(5); // Regenera maná aleatoriamente
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
}
