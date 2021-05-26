package qmp.model;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

    List<Prenda> prendas;
    Solicitud solicitud;
    TipoGuardarropa tipo;

    public Guardarropa(TipoGuardarropa tipo){
        this.tipo=tipo;
        this.prendas = new ArrayList<>();
        this.solicitudes = new ArrayList<Solicitud>();

    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda){
        if (!prendas.contains(prenda)) throw new RuntimeException("no existe la prenda que se desea quitar");
        prendas.remove(prenda);
    }

    public void compartirCon(Usuario usuario){
        usuario.agregrarGuardarropa(this);
    }

    public void proponerQuitarPrenda(Prenda prenda){
        if (!this.prendas.contains(prenda)) throw new RuntimeException("la prenda no esta en la lista actual");
        this.prendasPendienteQuitar.add(prenda);
    }

    public void proponerAgregarPrenda(Prenda prenda){
        if (this.prendas.contains(prenda)) throw new RuntimeException("la prenda ya esta en la lista actual");
        this.prendasPendienteAgregar.add(prenda);
    }

    public List<Prenda> getPrendasPendienteAgregar() {
        return prendasPendienteAgregar;
    }

    public List<Prenda> getPrendasPendienteQuitar() {
        return prendasPendienteQuitar;
    }

}
