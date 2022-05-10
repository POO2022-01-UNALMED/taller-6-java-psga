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

}
