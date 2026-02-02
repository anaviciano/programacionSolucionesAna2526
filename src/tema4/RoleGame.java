package tema4;

import java.util.Random;
import java.util.Scanner;

public class RoleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero("My Hero", 10, 10);
        Random random = new Random();


        int hordes = 1;
        while (hero.getHealth() > 0) {
            System.out.printf("Horde %d\r\n", hordes++);
            Hero[] enemies = new Hero[random.nextInt(1, 4)];
            for (int i = 0; i < enemies.length; i++) {
                enemies[i] = new Hero("Enemy " + (i + 1), 5, 5, 10);
            }
            System.out.println(hero);
            while (!areAllDead(enemies)) {
                for (Hero enemy : enemies) {
                    System.out.println(enemy);
                    if (random.nextFloat() < 0.9) { // 90% posibilidades de que ataque o 10% de que huya de la pelea
                        System.out.println("Hero ataca al enemigo");
                        hero.attack(enemy);
                        if (enemy.getHealth() > 0) {
                            System.out.println("Enemigo ataca al hero");
                            enemy.attack(hero);
                        } else {
                            System.out.println("Enemigo está muerto");
                        }
                    }
                    if (random.nextFloat() < 0.1) {
                        hero.drinkPotion();
                    }
                    if (random.nextFloat() < 0.001) {
                        hero.rest();
                    }
                }
            }
            System.out.println("Todos los enemigos están muertos");
            scanner.nextLine();
        }
    }

    public static boolean areAllDead(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                return false;
            }
        }
        return true;
    }
}
