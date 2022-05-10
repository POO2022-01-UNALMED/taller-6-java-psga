package vehiculos;
public class Camioneta extends Vehiculo{
    static int CantidadCamionetas;
    boolean volco;
    public Camioneta(String pi,int pn,String n,double p,double pe,Fabricante Fab,boolean v) {
        super(pi,pn,90,n,p,pe,"4X4",Fab);
        this.volco = v;
        CantidadCamionetas++;
    }
    public boolean isVolco() {
        return this.volco;
    }

    public void setVolco(boolean v) {
        this.volco=v;
    }

    public static int getCantidadCamionetas() {
        return Camioneta.CantidadCamionetas;
    }
}