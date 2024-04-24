package B2;
//Implementar una clase Moto para que la guardamos la velocidad. Tendremos dos métodos uno para
//acelerar (aumentamos su velocidad en una cantidad variable) y otro para frenar (disminuimos la
//velocidad en una cantidad variable). Generar una clase con un main y crear una moto, y acelerarla y
//frenarla para probar la clase.
//Hay que controlar que la moto no puede tener una velocidad negativa ni tener una velocidad superior a 150
public class Moto {
    
    int velocidad;
    
    
    public int getVelocidad() {
    return velocidad;
        
    }
    public void setVelocidad(int velocidad) {
        
        this.velocidad = velocidad;
        
        if ( velocidad == 0){
        System.out.println("La moto esta apagada");
        }
        
        if( velocidad > 0  && velocidad < 40){
        System.out.println("La moto esta frenando");
        }
        if (velocidad >= 40 && velocidad < 150 ){
            
        System.out.println("La moto esta acelerando");
        }
        if (velocidad >= 150){
        System.out.println("Ha excedido la velocidad");
        }
    }
}

        
        