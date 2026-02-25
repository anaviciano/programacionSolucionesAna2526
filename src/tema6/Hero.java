package tema6;

public class Hero extends Entity {
    public Hero(String n, int h) {
        super(n);
        //this.name = n;
        this.health = h;
        this.damage = 10;
    }
    //Este this() con un solo parámetro, no funciona, porque yo no tengo ningún constructor con 1 parámetro
    //public Hero(){this("default")   }

    public Hero(){
        this("default", 100);
    }
    @Override
    public void attack(Entity entity)
    {
        System.out.println("Este ataque es de la clase Hero");
        entity.health -= this.damage;
    }
}
