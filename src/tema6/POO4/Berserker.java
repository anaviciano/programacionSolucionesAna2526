package tema6.POO4;

import java.util.Random;

public class Berserker implements ICombatiente {
    private int vida;
    private Random random;

    public Berserker(int vida) {
        this.vida = vida;
        this.random = new Random();
    }

    @Override
    public Ataque atacar() {
        int dano = (150 - vida) / 2; // Más daño cuanto menos vida
        return new Ataque(dano, 0, "cuerpo a cuerpo");
    }

    @Override
    public void defender(Ataque ataque) {
        int danoRecibido = ataque.getTipoAtaque().equals("a distancia") ? ataque.getDanoFisico() * 2 : ataque.getDanoFisico() / 2;
        vida -= danoRecibido;
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
}
