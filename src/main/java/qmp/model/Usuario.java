package qmp.model;

import qmp.model.Observer;
import qmp.model.Prenda;
import qmp.model.Sugerencias;

import java.util.List;

public class Usuario implements Observer {

    private Sugerencias sugerencias;
    private String ciudad;

    //recibo una referencia a Atuendo
    Usuario(Sugerencias sugerencias, String ciudad){
        this.sugerencias = sugerencias;
        this.ciudad = ciudad;
    }

    //Me inscribo a sugerencias
    public void addPrenda(Prenda prenda){
        sugerencias.add(this);
    }

    //Me desinscribo a sugerencias
    public void removePrenda(Prenda prenda){
        //todo: debiera validar primero que existe prendas ya generadas
        sugerencias.remove(this);
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public void update(List<Prenda> sugerencias) {
        //todo: Los usuarios deben recibir sugerencias
    }


}
