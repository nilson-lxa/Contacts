package practica;


public class Complejo {
    private final double parteReal;
    private final double parteImaginaria;

    Complejo(double c1,double c2){
        parteReal=c1;
        parteImaginaria=c2;
    }
    
    public Complejo agregarComplejo(double r, double i){
        return new Complejo(r,i);
    }
    
    public Complejo establecer(double r, double i){
        Complejo c1;
        c1=new Complejo(r,i);
        return c1;
    }
    
    public Complejo Producto(Complejo c1, Complejo c2){
     double x=c1.parteReal*c2.parteReal-c1.parteImaginaria*c2.parteImaginaria;
     double y=c1.parteReal*c2.parteImaginaria+c1.parteImaginaria*c2.parteReal;
     return new Complejo(x, y);
    }
    
    public void imprimirComplejos(){
        System.out.println(parteReal +"+"+(parteImaginaria+"i"));
    }
    
    public void imprimirComplejos(double r, double i){
        System.out.println(r+(i+"i"));
    }

    @Override
    public String toString() {
        return parteReal+"+"+(parteImaginaria+"i");
    }
    
    
}

