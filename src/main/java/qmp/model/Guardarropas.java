package qmp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import qmp.persistence.PersistenceId;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Guardarropas extends PersistenceId {

    @OneToMany
    private List<Prenda> prendas;

    @Transient
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

    @JsonAnyGetter
    public List<Prenda> getPrendas(){
        return prendas;
    }

    public List<Atuendo> todasLasPosiblesCombinaciones() {
        return new ArrayList<>();
    }

    @JsonAnyGetter
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

    @Override
    public String toString() {
        return "{"
            + '"' + "id" + '"' + ": " + this.getId() + ','
            + '"' + "prendas" + '"' + ": " + this.getPrendas()
            + "}";
    }
}
