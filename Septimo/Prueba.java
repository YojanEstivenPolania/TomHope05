package G7;

public class Prueba {
    public static void main(String[] args) {
        // Crear un reloj con una hora concreta
        Reloj reloj = new Reloj(0,0,0);

        // Modificar la hora y los minutos
        reloj.setHora(5);
        reloj.setMinuto(30);
        reloj.setSegundo(45);

        // Adelantar el reloj
        reloj.adelantarReloj(0); // Adelantar la hora en segundos

        // Atrasar el reloj
        reloj.atrasarReloj(0); // Atrasar la hora en segundos

        // Consultar la hora actual
        System.out.println("Hora actual: " + reloj.getHora() + ":" + reloj.getMinuto() + ":" + reloj.getSegundo());
    }
}

