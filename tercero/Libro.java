package C3;
//Crea una clase llamada Libro
//La clase debe guardar el título del libro, autor/a, número de ejemplares del libro (número de
//ejemplares totales de un determinado libro) y número de ejemplares prestados (irá cambiando a
//medida que prestamos/devolvemos libros). métodos:
//- Constructor por defecto. - Constructor con parámetros.
//- Métodos setters/getters.
//- Método prestar() que incremente el atributo correspondiente cada vez que se realice un préstamo
//del libro. 
//Devuelve true si se ha podido realizar la operación y false en caso contrario.
//- Método devolver() que decrementa el atributo correspondiente cuando se produzca la devolución
//de un libro.  Devuelve true si se ha podido realizar la operación y false en caso contrario.
//Una vez creada la clase, escribe una clase LibroMain.java con un método main, crea 2 libros y ejecuta
//las operaciones disponibles para probar la funcionalidad de la clase. 
public class Libro {
    
    private String Titulo;
    private String Autor;
    private int numlibros;
    private int numlibprest;
    
     public Libro() {
    }
    //Constructor con parámetros
    public Libro(String Titulo, String Autor, int numlibros) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numlibros = numlibros;   
    }
    //getter and setter
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public int getNumlibros() {
        return numlibros;
    }
    public void setNumlibros(int numlibros) {
        this.numlibros = numlibros;
    }
    public int getNumlibprest() {
        return numlibprest;
    }
    public void setNumlibprest(int numlibprest) {
        this.numlibprest = numlibprest;
    }
    // Método prestar
    public boolean prestar() {
        if (numlibros > numlibprest) {
            numlibprest++;
            return true;
        } else {
            return false;
        }
    }
    //Metodo devolver
    public boolean devolver() {
        if (numlibprest > 0) {
            numlibprest--;
            return true;
        }else {
            return false;
        }
     }  
    }

    
    
    
    
    

