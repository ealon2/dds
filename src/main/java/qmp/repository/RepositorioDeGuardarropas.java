package qmp.repository;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import qmp.model.Guardarropas;

import java.util.List;

public class RepositorioDeGuardarropas implements WithGlobalEntityManager {
  private final static RepositorioDeGuardarropas INSTANCE = new RepositorioDeGuardarropas();


  private RepositorioDeGuardarropas() {
  }

  public static RepositorioDeGuardarropas instance() {
    return INSTANCE;
  }

  public void agregarGuardarropa(Guardarropas guardarropas) {
    entityManager().persist(guardarropas);
  }

  public List<Guardarropas> obtenerGuardarropa() {
    return entityManager()
        .createQuery("from Guardarropas", Guardarropas.class)
        .getResultList();
   }

}

