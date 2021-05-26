package qmp.model;

import java.util.ArrayList;
import java.util.List;

public class Atuendo implements Observable {

    private final List<Usuario> usuarios;
    private Clima clima;
    public EstadoClima getClima(String ciudad) {
        return clima.getWeather(ciudad);
    }

    static List<Prenda> getSugerencia(String ciudad, List<Prenda> armario){
        return new ArrayList<Prenda>();
    }

    public Atuendo(){
        this.usuarios = new ArrayList<Usuario>();
    }

    @Override
    public void add(Usuario usuario) {
        // Guarda objetos
        this.usuarios.add(usuario);
    }

    @Override
    public void remove(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    @Override
    public void compartirCon(Usuario usuario, List<Prenda> guardarropa) {

    }

    private void inform(){
        usuarios.forEach(usuario->usuario.update(new ArrayList<Prenda>()));
    }
}

