package qmp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solicitud {
    Map<Accion,Prenda> solicitudesPrenda;

    Solicitud (){
        this.solicitudesPrenda= new HashMap<Accion,Prenda>();
    }

    public void altaDeSolicitud(Accion accion, Prenda prenda){
        this.solicitudesPrenda.put(accion,prenda);
    }

    public void aceptarSolicitud(Prenda prenda){

    }

    public void rechazarSolicitud(Prenda prenda){

    }

    public List<Prenda> getAltaDePrendas(){
        
    }
}
