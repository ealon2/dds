package qmp.controller;

import qmp.model.*;
import qmp.repository.RepositorioDeGuardarropas;
import spark.Request;
import spark.Response;

public class GuardarropaController {

  private final static GuardarropaController INSTANCE = new GuardarropaController();
  private RepositorioDeGuardarropas repositorio;

  public GuardarropaController(){
    repositorio = RepositorioDeGuardarropas.instance();
  }

  public static GuardarropaController getInstance() {
    return INSTANCE;
  }

  public Object obtenerGuardarropas(Request request, Response response) {
    response.body(repositorio.obtenerGuardarropa().toString());
    return response.body();
  }

  public Object crearGuardarropa(Request request, Response response) {
    repositorio.agregarGuardarropa(new Guardarropas());
    response.status(200);
    response.body(repositorio.obtenerGuardarropa().toString());
    return response.body();
  }

  public Void editarPrenda(Request request, Response response) {
    return null;
  }

  public Void borrarPrenda(Request request, Response response) {
    return null;
  }

  public Response editarGuardarropa(Request request, Response response) {
    return response;
  }

  public Response obtenerPrendaDeGuardarropa(Request request, Response response) {
    return response;
  }

  public Response agregarPrendaAGuardarropa(Request request, Response response) {
    return response;
  }

  public Response borrarGuardarropa(Request request, Response response) {
    return response;
  }
}
