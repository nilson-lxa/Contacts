
package practica;


public class mainComplejo {
    public static void main(String[] args) {
        Complejo c2,c1,c3;
        c1= new Complejo(3,4);
        c2= new Complejo(10,5);
        c1.imprimirComplejos();
        c1=c1.agregarComplejo(5, 6);
        c1.imprimirComplejos();
        c2.imprimirComplejos();
        c3=c1.Producto(c1,c2);
        System.out.println(c3.toString());
    }
}
