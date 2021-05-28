package qmp.model;

public class QuitarPrenda implements SugerenciaCommand{

    private Prenda prenda;
    private Guardarropa guardarropa;
    QuitarPrenda(Prenda prenda, Guardarropa guardarropa){
        this.prenda = prenda;
    }

    @Override
    public void execute(){
        this.guardarropa.quitarPrenda(prenda);
    }

    @Override
    public void unexecute(){
        this.guardarropa.agregarPrenda(prenda);
    }
}
