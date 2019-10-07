
package interfaz;

public class Primo {
    
    public boolean esPrimo(int num){
        int contador=0;
        boolean veri=false;
        for (int i = 1; i <= num; i++)
            if(num % i == 0)
                contador++;
        
        if(contador == 2)
           veri=true;
        
        return veri;
    }
    
    public String seriePrimos(int cantElementos){
        String cad="";
        int contador=0,cont=0;
        boolean veri=true;
        while(contador < cantElementos){
            cont++;
            while(veri){
                if(esPrimo(cont)){
                    cad+=cont+", ";
                    contador++;
                    break;
                }
                else 
                    break;
            }
            System.out.println("hola");
        }
        return cad;
    }
}
