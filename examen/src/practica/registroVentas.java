
package practica;


public class registroVentas {
    private double montoVentas;
    private int vehiculoVendido;
    private String apellido;
    private String nombre;
    private String id;

    public registroVentas(double montoVentas, int vehiculoVendido, String apellido, String nombre, String id) {
        this.montoVentas = montoVentas;
        this.vehiculoVendido = vehiculoVendido;
        this.apellido = apellido;
        this.nombre = nombre;
        this.id = id;
    }
    
    public registroVentas() {
        this.montoVentas = 0;
        this.vehiculoVendido = 0;
        this.apellido = "Sin apellido";
        this.nombre = "Sin nombre";
        this.id = "Sin id";
    }
    
    
}
