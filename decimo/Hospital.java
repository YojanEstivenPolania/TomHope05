package J10;

public class Hospital {
    //Atributos
    private int codHospital;
    private String nombreHospital;
    private String dirección;
    private String telefono;
    private int habitacionestotales;
    private int habitacionesocupadas;
    //Constructor
    public Hospital(int codHospital, String nombreHospital, String dirección, String telefono, int habitacionestotales, int habitacionesocupadas) {
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.dirección = dirección;
        this.telefono = telefono;
        this.habitacionestotales = habitacionestotales;
        this.habitacionesocupadas = habitacionesocupadas;
    }
    //GetySet
    public int getCodHospital() {
        return codHospital;
    }
    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }
    public String getNombreHospital() {
        return nombreHospital;
    }
    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }
    public String getDirección() {
        return dirección;
    }
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getHabitacionestotales() {
        return habitacionestotales;
    }
    public void setHabitacionestotales(int habitacionestotales) {
        this.habitacionestotales = habitacionestotales;
    }
    public int getHabitacionesocupadas() {
        return habitacionesocupadas;
    }
    public void setHabitacionesocupadas(int habitacionesocupadas) {
        this.habitacionesocupadas = habitacionesocupadas;
    }
    //Método ingreso()
    public boolean ingreso(){
        if (habitacionesocupadas >= habitacionestotales) {
        return false;
    }
        habitacionesocupadas++;
        return true;
        
    }
    //Método alta()
    public boolean alta(){
        if (habitacionesocupadas <= 0){
        return false;
        }
        habitacionesocupadas--; 
        return true;
    }
    //Método toString(), que muestre todos los datos del hospital.
    @Override
    public String toString() {
        return "CodHospital=" + codHospital + ", Nombre Hospital=" + nombreHospital + ", Direcci\u00f3n=" + dirección + ", Telefono=" + telefono + ", Habitacionestotales=" + habitacionestotales + ", Habitacionesocupadas=" + habitacionesocupadas;
    }
}
    


