package qmp.model;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ealon2
 * @version 1.0
 * @throws RuntimeException Se lanza esta excepcion ante cualquier eventual error.
 */
public class Guardarropa {

    private List<Prenda> prendas; // listado de prendas aceptadas
    private String criterio; // Criterio del guardarropa

    public Guardarropa(@NotNull String criterio){
        this.criterio = criterio;
        this.prendas = new ArrayList<Prenda>();
    }

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda) {
        this.prendas.remove(prenda);
    }

    public List<Prenda> getPrendas(){
        return prendas;
    }
}
