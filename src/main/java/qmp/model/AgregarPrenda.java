package qmp.model;

public class AgregarPrenda implements SugerenciaCommand{

    private final Prenda prenda;
    private final Guardarropa guardarropa;

    public AgregarPrenda(Prenda prenda, Guardarropa guardarropa){
        this.guardarropa=guardarropa;
        this.prenda = prenda;
    }

    @Override
    public void execute(){
        this.guardarropa.agregarPrenda(prenda);
    }

    @Override
    public void unexecute(){
        this.guardarropa.quitarPrenda(prenda);
    }
}
