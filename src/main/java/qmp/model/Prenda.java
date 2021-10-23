package qmp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.w3c.dom.css.RGBColor;
import qmp.persistence.PersistenceId;

import javax.persistence.Entity;
import javax.persistence.Transient;

import static java.util.Objects.requireNonNull;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Prenda extends PersistenceId {

    @Transient
    private RGBColor color;
    @Transient
    private Material material;
    @Transient
    private TipoDePrenda tipoDePrenda;
    @Transient
    private RGBColor colorSecundario;
    @Transient
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

    @Override
    public String toString() {
        return "{"
            + '"' + "id" + '"' + ": " + id + ','
            + '"' + "material" + '"' + ": " + material + ','
            + '"' + "tipo" + '"' + ": " + tipoDePrenda + ','
            + '"' + "color" + '"' + ": " + color + ','
            + '"' + "colorSecundario" + '"' + ": " + colorSecundario + ','
            + '"' + "trama" + '"' + ": " + trama
            + "}";
    }
}
