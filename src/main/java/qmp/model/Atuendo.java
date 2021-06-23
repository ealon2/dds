package qmp.model;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Atuendo implements Observable {

    private final List<Usuario> usuarios;
    private final Clima clima;

    public Atuendo(Clima clima){
        this.clima = clima;
        this.usuarios = new ArrayList<Usuario>();
    }

    public EstadoClima getClima(@NotNull String ciudad) {
        return this.clima.obtenerEstadoDeClima(ciudad);
    }

    @Override
    public void add(@NotNull Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void remove(@NotNull Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    @Override
    public void compartirCon(Usuario usuario, Guardarropa guardarropa) {
        usuario.agregrarGuardarropa(guardarropa);
    }

    private void enviarSugerencia(){
        //usuarios.forEach(usuario->usuario.escucharSugerencias(new AltaSugerencia()));
    }

}

