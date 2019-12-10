package ejt.edu.tesoem.genita212.itic.usogson7t11;

public class Datos {
    String Nombre;
    int Edad;
    String Correo;
    String CURP;

    public Datos(String nombre, int edad, String correo, String CURP) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
        this.CURP = CURP;
    }

    public String  getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }


}
