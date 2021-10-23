package qmp.repository;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import qmp.model.Prenda;
import java.util.List;

public class RepositorioDePrendas implements WithGlobalEntityManager {

  private final static RepositorioDePrendas INSTANCE = new RepositorioDePrendas();

  private RepositorioDePrendas(){
  }

  public RepositorioDePrendas getInstance(){
    return INSTANCE;
  }

  public List<Prenda> getPrendas(){
    return entityManager()
        .createQuery("select * from Prenda", Prenda.class).getResultList();
  }

}
