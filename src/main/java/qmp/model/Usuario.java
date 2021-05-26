package qmp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario implements Observer {

    private Atuendo atuendo;
    private String ciudad;
    private UUID id;


    private List<Guardarropa> guardarropas;

    //recibo una referencia a Atuendo
    Usuario(@JsonProperty("ciudad") String ciudad, Atuendo atuendo){
        this.id =UUID.randomUUID();
        this.ciudad = ciudad;
        this.atuendo = atuendo;
        this.guardarropas = new ArrayList<Guardarropa>();
    }

    public List<Guardarropa> getGuardarropas() {
        return guardarropas;
    }
    public String getCiudad() {
        return ciudad;
    }

    @Override
    public void update(List<Prenda> sugerencias) {
        //todo: Los usuarios deben recibir sugerencias
    }

    public void agregrarGuardarropa(Guardarropa guardarropa) {
        this.guardarropas.add(guardarropa);
    }
}
