package qmp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observer {

    private String ciudad;
    private List<Guardarropa> guardarropas;
    private List<SugerenciaCommand> sugerencias;

    /**
     *
     * @param ciudad
     */
    Usuario(@JsonProperty("ciudad") String ciudad){
        this.ciudad = ciudad;
        this.guardarropas = new ArrayList<Guardarropa>();
        this.sugerencias = new ArrayList<SugerenciaCommand>();
    }

    /**
     *
     * @param sugerencia
     */
    @Override
    public void escucharSugerencias(@NotNull SugerenciaCommand sugerencia) {
        this.sugerencias.add(sugerencia);
    }

    /**
     *
     * @param guardarropa
     */
    public void agregrarGuardarropa(@NotNull Guardarropa guardarropa) {
        this.guardarropas.add(guardarropa);
    }

    /**
     *
     * @param sugerencia
     */
    public void ejecutarSugerencia(@NotNull SugerenciaCommand sugerencia){
        sugerencia.execute();
    }

    /**
     *
     * @param sugerencia
     */
    public void reversarSugerencia(@NotNull SugerenciaCommand sugerencia){
        sugerencia.unexecute();
    }

    /**
     *
     * @param sugerencia
     */
    public void rechazarSugerencia(@NotNull SugerenciaCommand sugerencia){
       this.sugerencias.remove(sugerencia);
    }


    /**
     *
     * @param usuario
     * @param guardarropa
     */
    public void compartirCon(@NotNull Usuario usuario, @NotNull Guardarropa guardarropa){
        usuario.agregrarGuardarropa(guardarropa);
    }

    public List<Guardarropa> getGuardarropas() {
        return guardarropas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<SugerenciaCommand> getSugerencias(){
        return sugerencias;
    }

}
