package vehiculos;
public class Camion extends Vehiculo{
    static int CantidadCamiones;
    int ejes;
    public Camion(String pla,String ni,double pra,double per,Fabricante Fab,int ej) {
        super(pla,2,80,ni,pra,per,"4X2",Fab);
        CantidadCamiones++;
        this.ejes = ej;
    }
    public int getEjes() {
        return this.ejes;
    }
    public void setPuestos(int ej) {
        this.ejes=ej;
    }
    public static int getCantidadCamiones() {
        return Camion.CantidadCamiones;
    }
}