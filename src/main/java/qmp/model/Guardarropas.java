package qmp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ealon2
 * @version 1.0
 * @throws RuntimeException Se lanza esta excepcion ante cualquier eventual error.
 */
public class Guardarropas {

    private List<Prenda> prendas; // listado de prendas aceptadas
    private List<Sugerencia> sugerencias;

    public Guardarropas(){
        this.prendas = new ArrayList<Prenda>();
        this.sugerencias = new ArrayList<Sugerencia>();
    }

    public void aceptarSugerencia(Sugerencia sugerencia){
        sugerencia.ejectuar(this);
    }

    public void reversarSugerencia(Sugerencia sugerencia){
        sugerencia.reversar(this);
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

    public List<Atuendo> todasLasPosiblesCombinaciones() {
        return new ArrayList<>();
    }

    public List<Sugerencia> obtenerSugerencias() {
        return sugerencias;
    }

    public void agregrarSugerencia(Sugerencia sugerencia) {
        this.sugerencias.add(sugerencia);
    }

    public void quitarSugerencia(Sugerencia sugerencia) {
        this.sugerencias.remove(sugerencia);
    }

    public List<Prenda> obtenerPrendas() {
        return prendas;
    }
}
