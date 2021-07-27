package qmp.model;

import org.w3c.dom.css.RGBColor;

import static java.util.Objects.requireNonNull;

public class Prenda{

    private RGBColor color;
    private Material material;
    private TipoDePrenda tipoDePrenda;
    private RGBColor colorSecundario;
    private Trama trama;

    public Prenda (RGBColor color, Material material, TipoDePrenda tipoDePrenda, Trama trama){
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "material es obligatorio");
        this.color = requireNonNull(color, "color es obligatorio");
        this.trama =trama;
    }

    public Prenda (RGBColor color,RGBColor colorSecundario, Material material, TipoDePrenda tipoDePrenda, Trama trama){
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "material es obligatorio");
        this.color = requireNonNull(color, "color es obligatorio");
        this.colorSecundario = requireNonNull(colorSecundario, "color secundario es obligatorio");
        this.trama=trama;
    }

    public Categoria getCategoria(){
        return this.tipoDePrenda.getCategoria();
    }

}
