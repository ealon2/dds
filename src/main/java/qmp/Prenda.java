package qmp;

import org.w3c.dom.css.RGBColor;

public class Prenda implements Observer{

    private RGBColor color;
    private Material material;
    private TipoDePrenda tipoDePrenda;
    private RGBColor colorSecundario;

    public Prenda (RGBColor color, Material material, TipoDePrenda tipoDePrenda){
        this.color = color;
        this.material = material;
        this.tipoDePrenda = tipoDePrenda;
    }

    public Prenda (RGBColor color,RGBColor colorSecundario, Material material, TipoDePrenda tipoDePrenda){
        this.color = color;
        this.material = material;
        this.tipoDePrenda = tipoDePrenda;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria(){
        return this.tipoDePrenda.getCategoria();
    }

    @Override
    public void update() {
        System.out.println("mensaje leido por Prenda");
    }

}
