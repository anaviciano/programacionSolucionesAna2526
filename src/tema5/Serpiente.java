package tema5;

import java.util.Random;

public class Serpiente {

    private static final char[] COLORES = {'r', 'v', 'a'};
    private static final Random random = new Random();

    private StringBuilder cuerpo;
    private int edad;          // en años (segundos)
    private boolean viva;

    public Serpiente() {
        this.cuerpo = new StringBuilder();
        this.cuerpo.append(colorAleatorio());
        this.edad = 0;
        this.viva = true;
    }

    private char colorAleatorio() {
        int idx = random.nextInt(COLORES.length);
        return COLORES[idx];
    }

    public boolean estaViva() {
        return viva;
    }

    public int getEdad() {
        return edad;
    }

    public int getLongitud() {
        return cuerpo.length();
    }

    public String getCuerpo() {
        return cuerpo.toString();
    }

    /**
     * Simula un año de vida SIN mangosta (para usar en el nido).
     */
    public String vivirUnAnioSinMangosta() {
        if (!viva) {
            return "La serpiente ya está muerta.";
        }

        edad++;
        double p = random.nextDouble();
        StringBuilder descripcion = new StringBuilder();
        descripcion.append("Año ").append(edad).append(": ");

        if (edad < 10) {
            // joven
            if (p < 0.8) {
                // crece
                char nuevoColor = colorAleatorio();
                cuerpo.append(nuevoColor);
                descripcion.append("Joven, crece y añade anilla '")
                        .append(nuevoColor).append("'. ");
            } else {
                // muda
                cambiarPiel();
                descripcion.append("Joven, muda la piel. ");
            }
        } else {
            // mayorcita
            if (p < 0.9) {
                // decrece
                if (cuerpo.length() > 0) {
                    cuerpo.deleteCharAt(cuerpo.length() - 1);
                    descripcion.append("Mayor, decrece y pierde 1 anilla. ");
                }
                if (cuerpo.length() == 0) {
                    viva = false;
                    descripcion.append("Se queda sin cuerpo y muere. ");
                }
            } else {
                // muda
                cambiarPiel();
                descripcion.append("Mayor, muda la piel. ");
            }
        }

        descripcion.append("Cuerpo actual: ").append(cuerpo);
        return descripcion.toString();
    }

    /**
     * Simula un año de vida CON posible mangosta (ejercicio 1).
     * Devuelve una descripción de lo ocurrido.
     */
    public String vivirUnAnioConMangosta() {
        if (!viva) {
            return "La serpiente ya está muerta.";
        }

        edad++;
        StringBuilder descripcion = new StringBuilder();
        descripcion.append("Año ").append(edad).append(": ");

        // 10% de probabilidad de ataque de mangosta
        double pMangosta = random.nextDouble();
        if (pMangosta < 0.10) {
            viva = false;
            descripcion.append("Una mangosta la ataca y muere. ");
            return descripcion.toString();
        }

        // Si no hay mangosta, aplica la lógica normal
        double p = random.nextDouble();

        if (edad < 10) {
            // joven
            if (p < 0.8) {
                char nuevoColor = colorAleatorio();
                cuerpo.append(nuevoColor);
                descripcion.append("Joven, crece y añade anilla '")
                        .append(nuevoColor).append("'. ");
            } else {
                cambiarPiel();
                descripcion.append("Joven, muda la piel. ");
            }
        } else {
            // mayorcita
            if (p < 0.9) {
                if (cuerpo.length() > 0) {
                    cuerpo.deleteCharAt(cuerpo.length() - 1);
                    descripcion.append("Mayor, decrece y pierde 1 anilla. ");
                }
                if (cuerpo.length() == 0) {
                    viva = false;
                    descripcion.append("Se queda sin cuerpo y muere. ");
                }
            } else {
                cambiarPiel();
                descripcion.append("Mayor, muda la piel. ");
            }
        }

        descripcion.append("Cuerpo actual: ").append(cuerpo);
        return descripcion.toString();
    }

    private void cambiarPiel() {
        int n = cuerpo.length();
        cuerpo.setLength(0);
        for (int i = 0; i < n; i++) {
            cuerpo.append(colorAleatorio());
        }
    }

    @Override
    public String toString() {
        return "Serpiente{" +
                "edad=" + edad +
                ", viva=" + viva +
                ", longitud=" + getLongitud() +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }
}

