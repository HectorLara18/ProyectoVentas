package mx.com.gm.ventas;

public class Orden {

    //Atributos

    private int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAXPRODUCTOS = 10;

    //Constructor

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAXPRODUCTOS];
    }

    //Metodos

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAXPRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("se a superado el maximo de productos: " + Orden.MAXPRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i= 0; i < this.contadorProductos; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
