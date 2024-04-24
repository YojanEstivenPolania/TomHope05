package G7;
//Crear una clase Reloj, con atributos hora, minuto y segundo, que pueda ser construida indicando los
//tres atributos, o bien solo la hora y minutos, o bien solo la hora.
//Crear ademas los métodos necesarios para modificar y consultar la hora en cualquier momento de forma manual.
public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor con los tres atributos
    public Reloj(int hora, int minuto, int segundo) {
        establecerHora(hora, minuto, segundo);
    }

    // Constructor con hora y minutos
    public Reloj(int hora, int minuto) {
        establecerHora(hora, minuto, 0);
    }

    // Constructor con solo la hora
    public Reloj(int hora) {
        establecerHora(hora, 0, 0);
    }

    // Métodos setters y getters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido.");
        }
    }

    // Método para establecer la hora con validación
    private void establecerHora(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    // Método para adelantar el reloj
    public void adelantarReloj(int cantidadDeSegundos) {
        int totalSegundos = hora * 3600 + minuto * 60 + segundo;
        totalSegundos += cantidadDeSegundos;
        totalSegundos %= 86400; // Ajustar si se pasa de un día
        hora = totalSegundos / 3600;
        minuto = (totalSegundos % 3600) / 60;
        segundo = totalSegundos % 60;
    }

    // Método para atrasar el reloj
    public void atrasarReloj(int cantidadDeSegundos) {
        int totalSegundos = hora * 3600 + minuto * 60 + segundo;
        totalSegundos -= cantidadDeSegundos;
        if (totalSegundos < 0) {
            totalSegundos += 86400; // Ajustar si se pasa de un día
        }
        hora = totalSegundos / 3600;
        minuto = (totalSegundos % 3600) / 60;
        segundo = totalSegundos % 60;
    }
}
    
