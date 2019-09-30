package practica;

class Vector3D {
    private double componenteI;
    private double componenteJ;
    private double componenteK;

    public Vector3D(double componenteI, double componenteJ, double componenteK) {
        this.componenteI = componenteI;
        this.componenteJ = componenteJ;
        this.componenteK = componenteK;
    }

    public Vector3D() {
        this.componenteI = 0;
        this.componenteJ = 0;
        this.componenteK = 0;
    }

    public double getComponenteI() {
        return componenteI;
    }

    public void setComponenteI(double componenteI) {
        this.componenteI = componenteI;
    }

    public double getComponenteJ() {
        return componenteJ;
    }

    public void setComponenteJ(double componenteJ) {
        this.componenteJ = componenteJ;
    }

    public double getComponenteK() {
        return componenteK;
    }

    public void setComponenteK(double componenteK) {
        this.componenteK = componenteK;
    }
   
    
    public void llenarVector(){
         this.componenteI=aleatorio(0,50);
         this.componenteJ=aleatorio(0,50);
         this.componenteK=aleatorio(0,50);
      }
      
    public int aleatorio(int min,int max){
          return (int)((max-min+1)*Math.random()+min);
      }
    
    public void mostrarVector(){
          System.out.println(this.componenteI+"i"+"+"+this.componenteJ+"j"+"+"+this.componenteK+"k");
      }
     
}

public class metodosVector3D{
    
    public Vector3D sumaVectores(Vector3D v1, Vector3D v2){
         Vector3D newVector;
         newVector=new Vector3D();
         
         newVector.setComponenteI(v1.getComponenteI()+v2.getComponenteI());
         newVector.setComponenteJ(v1.getComponenteJ()+v2.getComponenteJ());
         newVector.setComponenteK(v1.getComponenteK()+v2.getComponenteK());
         
         return newVector;
    }
    
    public Vector3D productoEscalar(Vector3D v1, Vector3D v2){
        Vector3D productoE;
        productoE=new Vector3D();
         
        productoE.setComponenteI(v1.getComponenteI()*v2.getComponenteI());
        productoE.setComponenteJ(v1.getComponenteJ()*v2.getComponenteJ());
        productoE.setComponenteK(v1.getComponenteK()*v2.getComponenteK());
        
        return productoE;
        
    }
    public boolean compararVectores(Vector3D v1, Vector3D v2){
        boolean veri=false;
        if(v1.getComponenteI()==v2.getComponenteI())
            if(v1.getComponenteJ()==v2.getComponenteJ())
                if(v1.getComponenteK()==v2.getComponenteK())
                    veri= true;
        
        return veri;
    }
}
    
   
