package tema6;

public class MainTema6 {
    public static void main(String[] args) {
       Hero h = new Hero("Heroe", 100);

        // Comprobando clases de Vehiculo
        Vehiculo coche = new Turismo("vehiculo", "Toyota", "Corolla", 2020, 5, "particular");
        Vehiculo camion = new Camion("vehiculo", "Volvo", "FH16", 2019, 44000, true);
        Vehiculo moto = new Ciclomotor("vehiculo", "Honda", "CBR", 2021, 150);

        System.out.println(coche);
        System.out.println(camion);
        System.out.println(moto);
        System.out.println("¿La moto necesita carnet? " + ((Ciclomotor) moto).necesitaCarnet());

        // Comprobando clases de Animal
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal pajaro = new Pajaro();


        perro.comer();
        perro.dormir();
        perro.hacerRuido();
        ((Perro) perro).moverCola();

        gato.comer();
        gato.dormir();
        gato.hacerRuido();
        ((Gato) gato).ronronear();

        pajaro.comer();
        pajaro.dormir();
        pajaro.hacerRuido();
        ((Pajaro) pajaro).volar();



        // Comprobando clases de Figura2D
        Figura2D cuadrado = new Cuadrado(4);
        Figura2D rectangulo = new Rectangulo(4, 6);
        Figura2D triangulo = new Triangulo(3, 4, 3, 4, 5);
        Figura2D circulo = new Circulo(5);

        System.out.println(cuadrado);
        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        // Comprobando clases de Ficha
        Ficha libro = new Libro(1, "El Quijote", "Miguel de Cervantes", "Editorial X");
        Ficha revista = new Revista(2, "National Geographic", 202, 2023);
        Ficha dvd = new DVD(3, "Inception", "Christopher Nolan", 2010, "Ciencia Ficción");

        System.out.println(libro);
        System.out.println(revista);
        System.out.println(dvd);

        // Comprobando clases de Publicacion
        IPublicacionConReaccion texto = new PublicacionTexto("Hola, mundo!");
        IPublicacionConReaccion foto = new PublicacionFoto("foto.jpg");
        //IPublicacionConReaccion video = new PublicacionVideo("video.mp4");

        texto.publicar();
        texto.compartir();
        texto.comentar("¡Genial!");

        foto.publicar();
        foto.compartir();
        foto.comentar("¡Bonita foto!");
        ((PublicacionFoto) foto).abrir();

        /*
        video.publicar();
        video.compartir();
        video.comentar("¡Buen video!");
        ((PublicacionVideo) video).abrir();

         */

        // Comprobando clases de Ataque
        IAtaqueAvanzado bolaFuego = new AtaqueBolaFuego(50, 100);
        IAtaqueAvanzado espadazo = new AtaqueEspadazo(30, 80);
        IAtaqueAvanzado espadazoEncantado = new AtaqueEspadazoEncantado(40, 20, 60, 70);

        bolaFuego.lanzar();
        System.out.println("Coste en maná: " + bolaFuego.coste()[0] + ", Coste en esfuerzo físico: " + bolaFuego.coste()[1]);
        System.out.println("Daño mágico: " + bolaFuego.danoInfligido()[0] + ", Daño físico: " + bolaFuego.danoInfligido()[1]);

        espadazo.lanzar();
        System.out.println("Coste en maná: " + espadazo.coste()[0] + ", Coste en esfuerzo físico: " + espadazo.coste()[1]);
        System.out.println("Daño mágico: " + espadazo.danoInfligido()[0] + ", Daño físico: " + espadazo.danoInfligido()[1]);

        espadazoEncantado.lanzar();
        System.out.println("Coste en maná: " + espadazoEncantado.coste()[0] + ", Coste en esfuerzo físico: " + espadazoEncantado.coste()[1]);
        System.out.println("Daño mágico: " + espadazoEncantado.danoInfligido()[0] + ", Daño físico: " + espadazoEncantado.danoInfligido()[1]);
    }
}
