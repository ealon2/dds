package qmp.model;

public interface Observable {
    //agrego usuario a lista de sugerencia
    public void add(Usuario usuario);
    //quito usuario a lista de sugerencia
    public void remove (Usuario usuario);
}
