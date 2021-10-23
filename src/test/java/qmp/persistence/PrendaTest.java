package qmp.persistence;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;
import org.w3c.dom.css.RGBColor;
import qmp.model.Material;
import qmp.model.Prenda;
import qmp.model.TipoDePrenda;
import qmp.model.Trama;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PrendaTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  @Test
  public void contextUp() {
    assertNotNull(entityManager());
  }

  @Test
  public void persistirPrenda(){
    entityManager().getTransaction().begin();
    entityManager().persist(buider());
  }

  @Test
  public void obtenerPrenda(){
    assertNotNull(entityManager().createQuery("from Prenda").getSingleResult());
  }

  public Prenda buider(){
    return new Prenda(Mockito.mock(RGBColor.class), Material.ALGODON, Mockito.mock(TipoDePrenda.class),Trama.LISA);
  }
}
