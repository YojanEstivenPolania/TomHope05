package J10;

public class Prueba {
    public static void main(String[] args) {
        Hospital miQueridoHospital = new Hospital(1234,"Mi Querido Hospital","Cll 40","3124574554", 100,50);
        
        System.out.println("Bienvenidos a Mi Querido Hospital");
        System.out.println(""+ miQueridoHospital);
        
       
        System.out.println("Ingreso:" + miQueridoHospital.ingreso());
        System.out.println("Ingreso:" + miQueridoHospital.ingreso());
        System.out.println("Habitacioness Ocupadas:" + miQueridoHospital.getHabitacionesocupadas());
        System.out.println("Alta:" + miQueridoHospital.alta());
        System.out.println("Habitaciones Ocupadas:" + miQueridoHospital.getHabitacionesocupadas());
        
  }
}
