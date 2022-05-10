

package vehiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Fabricante {
    static ArrayList<Fabricante> listadoFabricantes;
    Pais pais;
    String nombre;
    public Fabricante(String n,Pais p) {
        this.nombre = n;
        this.pais = p;
    }
    public Fabricante(String n) {
        this.nombre = n;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nomb) {
        this.nombre=nomb;
    }
    public Pais getPais() {
        return this.pais;
    }
    public void setNombre(Pais ps) {
        this.pais=ps;
    }
    public static Fabricante fabricaMayorVentas() {

        for(Vehiculo i : Vehiculo.getListado()) {

            if(listadoFabricantes==null) {
                listadoFabricantes=new ArrayList<Fabricante>();
                Fabricante.listadoFabricantes.add(i.getFabricante());
            }else {
                Fabricante.listadoFabricantes.add(i.getFabricante());
            }
        }


        //System.out.println(Fabricante.listadoFabricantes);
        HashMap<String, Integer> hm = new HashMap();
        for (int i = 0; i < Fabricante.listadoFabricantes.size(); i++) {

            String key = Fabricante.listadoFabricantes.get(i).getNombre();
            if ( hm.containsKey(key) ) {
                hm.put(key, hm.get(key) + 1);
            }else {

                hm.put(key, 1);
            }
        }
        //System.out.println(hm.values());
        int max = Collections.max(hm.values());

        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }

        return new Fabricante(keys.get(0));
    }
}