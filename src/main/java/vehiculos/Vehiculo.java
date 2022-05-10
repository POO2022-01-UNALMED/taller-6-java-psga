package vehiculos;
import java.util.ArrayList;
public class Vehiculo {

    double peso;
    String placa;
    int puertas;
    double velocidadMaxima;
    static int CantidadVehiculos;
    String nombre;
    String traccion;
    Fabricante fabricante;
    double precio;
    static ArrayList<Vehiculo> listado;

    public Vehiculo(String pl,int pu,double vm,String n,double p,double pe,String tra,Fabricante fab) {
        this.placa = pl;
        this.velocidadMaxima = vm;
        this.nombre = n;
        this.puertas = pu;
        this.precio = p;
        this.peso = pe;
        this.traccion = tra;
        this.fabricante= fab;
        if(listado==null) {
            listado=new ArrayList<Vehiculo>();
            Vehiculo.listado.add(this);
        }else {
            Vehiculo.listado.add(this);
        }
        CantidadVehiculos++;

    }

    public static String totalPorTipo() {
        return "Automoviles: "+Automovil.getCantidadAutomoviles()+
                "\nCamionetas: "+Camioneta.getCantidadCamionetas()+
                "\nCamiones: "+Camion.getCantidadCamiones();
    }

    public static int getCantidadVehiculos() {
        return Vehiculo.CantidadVehiculos;
    }

    public String getPlaca() {
        return this.placa;
    }
    public int getPuertas() {
        return this.puertas;
    }
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    public double getPeso() {
        return this.peso;
    }
    public String getTraccion() {
        return this.traccion;
    }
    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public static ArrayList<Vehiculo> getListado() {
        return Vehiculo.listado;
    }
    public static void setCantidadVehiculos(int num) {
        Vehiculo.CantidadVehiculos =num;
    }
    public void setPlaca(String pl) {
        this.placa =pl;
    }
    public void setPuertas(int pu) {
        this.puertas = pu;
    }
    public void setVelocidadMaxima( double vm) {
        this.velocidadMaxima = vm;;
    }
    public void setNombre(String n) {
        this.nombre = n;
    }
    public void setPrecio(double pr) {
        this.precio = pr;
    }
    public void setPeso(double pe) {
        this.peso = pe;
    }
    public void setTraccion( String tra) {
        this.traccion = tra;
    }
    public void setFabricante(Fabricante Fab) {
        this.fabricante = Fab;
    }
}
