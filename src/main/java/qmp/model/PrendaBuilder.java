package qmp.model;

import org.w3c.dom.css.RGBColor;

public class PrendaBuilder {
  private RGBColor color;
  private Material material;
  private TipoDePrenda tipoDePrenda;
  private RGBColor colorSecundario;
  private Trama trama = Trama.LISA;

  PrendaBuilder(TipoDePrenda tipoDePrenda){
    this.tipoDePrenda=tipoDePrenda;
  }

  public void especificarColorPrimario(RGBColor color){
    this.color=color;
  }

  public void especificarColorSecundario(RGBColor color){
    this.colorSecundario=color;
  }

  public void especificarMaterial(Material material){
    this.material=material;
  }

  public Prenda crearPrenda(){
    return new Prenda(color,material,tipoDePrenda,trama);
  }
}
