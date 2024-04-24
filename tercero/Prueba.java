package C3;

public class Prueba {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Bridgerton","Chris Van Dusen",10);
        Libro libro2 = new Libro ("After","Anna Todd",5);
        
        System.out.println("Libro 1\nTítulo:" + libro1.getTitulo() + "\nEjemplares disponibles: " + (libro1.getNumlibros()-libro1.getNumlibprest()));
        System.out.println("Prestar Libro 1\n" + libro1.prestar());
        System.out.println("Devolver Libro 1\n" + libro1.devolver());
        System.out.println("---------------------");
        System.out.println("Libro 2\nTitulo:" + libro2.getTitulo() + "\nEjemplares disponibles: " + (libro2.getNumlibros()-libro2.getNumlibprest()));
        System.out.println("Prestar Libro 2\n" + libro2.prestar());
        System.out.println("Devolver Libro 2\n" + libro2.devolver());
    }
}
