package qmp.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario{

    private String ciudad;
    private List<Guardarropas> guardarropas;

    Usuario(String ciudad){
        this.ciudad = ciudad;
        this.guardarropas = new ArrayList<Guardarropas>();
    }

    public void agregrarGuardarropas(Guardarropas guardarropas) {
        this.guardarropas.add(guardarropas);
    }

    public void quitarGuardarropas(Guardarropas guardarropas) {
        this.guardarropas.remove(guardarropas);
    }

    public void compartirCon(Usuario usuario, Guardarropas guardarropas){
        usuario.agregrarGuardarropas(guardarropas);
    }

    public List<Guardarropas> getGuardarropas() {
        return guardarropas;
    }

    public String getCiudad() {
        return ciudad;
    }

}
