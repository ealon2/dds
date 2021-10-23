package qmp.controller;

import spark.Request;
import spark.Response;

public class PrendaController {

  private final static PrendaController INSTANCE = new PrendaController();

  private PrendaController(){
  }

  public static PrendaController getInstance(){
    return INSTANCE;
  }

  public Void obtenerPrenda(Request request, Response response){
    return null;
  }

  public Void crearPrenda(Request request, Response response){
    return null;
  }

  public Void borrarPrenda(Request request, Response response){
    return null;
  }

  public Void actualizarPrenda(Request request, Response response){
    return null;
  }

}
