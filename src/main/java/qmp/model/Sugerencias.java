package qmp.model;

import java.util.ArrayList;
import java.util.List;

public class Sugerencias implements Observable {

    private List<Usuario> usuarios;
    private Clima clima;
    public EstadoClima getClima(String ciudad) {
        return clima.getWeather(ciudad);
    }

    static List<Prenda> getSugerencia(String ciudad, List<Prenda> armario){
        return new ArrayList<Prenda>();
    }

    public Sugerencias(){
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

    private void inform(){
        usuarios.forEach(usuario->usuario.update(new ArrayList<Prenda>()));
    }
}

