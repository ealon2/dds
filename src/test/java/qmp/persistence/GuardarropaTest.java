package qmp.persistence;

import org.junit.jupiter.api.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;
import qmp.model.Guardarropas;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GuardarropaTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  @Test
  public void contextUp() {
    assertNotNull(entityManager());
  }

  @Test
  public void persistirGuardarropa(){
    entityManager().persist(new Guardarropas());
  }

  @Test
  public void obtenerGuardarropaPersistido(){
    entityManager().getTransaction().begin();
    entityManager().persist(new Guardarropas());

    Guardarropas guardarropas = entityManager()
        .createQuery("from Guardarropas",Guardarropas.class)
        .getSingleResult();

    assertNotNull(guardarropas);
  }

}
