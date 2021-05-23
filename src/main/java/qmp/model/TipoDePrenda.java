package qmp.model;

import qmp.model.Categoria;

//TODO Agregar la validacion de Categoria en las clases hijas (hook)
//TODO Revisar si se puede emplear un Abstract Method
public abstract class TipoDePrenda {

    Categoria categoria;
    public abstract void validarCategoria(Categoria categoria);

    public TipoDePrenda(Categoria categoria){
        this.validarCategoria(categoria);
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
