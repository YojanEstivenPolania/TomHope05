package E5;
//Construir una clase llamada Semáforo que simule un semáforo; 
//tiene un un atributo color, y un método cambio() que cada vez que se llama, 
//cambia el atributo color entre verde, amarillo y rojo en
//ese orden, y además, escribe en consola el nuevo color que tiene.
//Cuando un objeto Semáforo se crea, su color inicial debe ser rojo.
//Crear una clase Prueba que en su main creen objeto de Semáforo y pruebe su método cambio() varias veces.
public class Semaforo {
    
    private String color; //atributo
    
    // constructor
    public Semaforo() {
        this.color = "Rojo";
    }
    
    //Metodo
    public void cambio (){
        color = switch (color) {
            case "rojo" -> "amarillo";
            case "amarillo" -> "verde";
            default -> "rojo";
        };
        System.out.println("El Color del Semáforo ha cambiado a: " + color);
    }
}
  
