package qmp.model;

import java.security.Guard;
import java.util.List;

public interface Observable {
    //agrego usuario a lista de sugerencia
    public void add(Usuario usuario);

    //quito usuario a lista de sugerencia
    public void remove (Usuario usuario);

    //compartir guardarropa
    void compartirCon(Usuario usuario, Guardarropa guardarropa);
}
