public class Hotel {
    private String nombre;
    private String direccion;
    private double precioNoche;
    private int estrellas;
    private String telefono;

    // Constructor
    public Hotel(String nombre, String direccion, double precioNoche, int estrellas, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precioNoche = precioNoche;
        this.estrellas = estrellas;
        this.telefono = telefono;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getPrecioNoche() {
        return precioNoche;
    }
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }
    public int getEstrellas() {
        return estrellas;
    }
    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // Método para modificar un hotel
    public void modificarHotel(String nombre, String direccion, double precioNoche, int estrellas, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precioNoche = precioNoche;
        this.estrellas = estrellas;
        this.telefono = telefono;
    }

}






















