
package practica;

public class mainVector3D {
    public static void main(String[] args) {
        Vector3D v1,v2,suma,producto;
        boolean comparados=false;
        metodosVector3D m1=new metodosVector3D();
        v1= new Vector3D();
        v2= new Vector3D();
        suma= new Vector3D();
        producto = new Vector3D();
        v1.llenarVector();
        v2.llenarVector();
        
        v1.mostrarVector();
        v2.mostrarVector();
        
        producto = m1.productoEscalar(v1, v2);
        suma = m1.sumaVectores(v1, v2);
        comparados= m1.compararVectores(v1, v2);
        
        producto.mostrarVector();
        suma.mostrarVector();
        System.out.println("Ambos vectores tienen componente iguales? ");
        if(comparados)
            System.out.println("Los vectores tienen igual componentes.");
        else
            System.out.println("Los vectores no tienen igual componente.");
    }
 
}
