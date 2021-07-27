package qmp.model;

public class AgregarPrenda implements Sugerencia {

    private final Prenda prenda;

    public AgregarPrenda(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void ejectuar(Guardarropas guardarropas){
        guardarropas.agregarPrenda(prenda);
    }

    @Override
    public void reversar(Guardarropas guardarropas){
        guardarropas.quitarPrenda(prenda);
    }
}
