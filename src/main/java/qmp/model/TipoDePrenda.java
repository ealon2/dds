package qmp.model;

public abstract class TipoDePrenda {

    private Categoria categoria;
    public abstract void validarCategoria(Categoria categoria);

    public TipoDePrenda(Categoria categoria){
        this.validarCategoria(categoria);
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
