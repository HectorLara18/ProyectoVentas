package mx.com.gm.ventas;

public class Producto {
    //Atributos
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio){
        this(); //Llamada al constructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
