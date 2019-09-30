
package practica;


public class Vehiculo {
    private int codigo;
    private String marca;
    private String tipo;
    private int modelo;
    private String patente;
    private double kilometraje;
    
    public Vehiculo() {
        this.codigo = 0;
        this.marca ="Sin marca";
        this.tipo = "Sin tipo";
        this.modelo = 0;
        this.patente = "Sin patente";
        this.kilometraje = 0;
    }

    public Vehiculo(int codigo, String marca, String tipo, int modelo, String patente, double kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.patente = patente;
        this.kilometraje = kilometraje;
    }
    
    public Vehiculo ingresoVehiculo(int codigo, String marca, String tipo, int modelo, String patente, double kilometraje){
        return new Vehiculo(codigo,marca,tipo,modelo,patente,kilometraje);
        
    }
}
