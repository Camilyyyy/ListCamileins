public class Jugadores {
    private int id;
    private String nombre;
    private String genero;
    private String deporte;
    private int rendimiento;
    private int edad;

    public Jugadores(int id, String nombre, String genero, String deporte, int rendimiento, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.deporte = deporte;
        this.rendimiento = rendimiento;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " Nombre:" +nombre +" Id:" + id  + " Genero=" + genero  + " Deporte:" + deporte + " Rendimiento=" + rendimiento + " Edad:" + edad +"\n";
    }
}