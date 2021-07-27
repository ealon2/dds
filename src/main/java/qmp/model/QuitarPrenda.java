package qmp.model;

public class QuitarPrenda implements Sugerencia {

    private Prenda prenda;

    QuitarPrenda(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void ejectuar(Guardarropas guardarropas){
        guardarropas.quitarPrenda(prenda);
    }

    @Override
    public void reversar(Guardarropas guardarropas){
        guardarropas.agregarPrenda(prenda);
    }
}
