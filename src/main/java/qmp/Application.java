package qmp;

import org.uqbarproject.jpa.java8.extras.export.JpaSchemaExport;
import qmp.controller.GuardarropaController;
import qmp.controller.PrendaController;

import spark.Spark;

import static spark.Spark.before;
import static spark.Spark.path;

import java.util.logging.Logger;

public class Application {

    public static void main (String[] argv) throws Exception {

        Logger log =  Logger.getLogger("com.api.jar");
        JpaSchemaExport.execute("db", "schema.sql", true, true);
        Spark.port(8080);

        GuardarropaController guardarropaController = GuardarropaController.getInstance();
        PrendaController prendaController = PrendaController.getInstance();

        Spark.path("/api", () -> {
            before("/*", (q, a) -> log.info("Received api call"));
            path("/guardarropa", () -> {
                Spark.get("/", guardarropaController::obtenerGuardarropas);
                Spark.post("/", guardarropaController::crearGuardarropa);
                Spark.put("/:id",     guardarropaController::editarGuardarropa);
                Spark.delete("/:id",  guardarropaController::borrarGuardarropa);
            });
            path("guardarropa/prenda", () -> {
                Spark.get("/:prenda", guardarropaController::obtenerPrendaDeGuardarropa);
                Spark.post("/:id",       guardarropaController::agregarPrendaAGuardarropa);
                Spark.put("/change",guardarropaController::editarPrenda);
                Spark.delete("/remove",  guardarropaController::borrarPrenda);
            });
            path("prenda", () -> {
                Spark.get("/:id", prendaController::obtenerPrenda);
                Spark.post("/:id",       prendaController::crearPrenda);
                Spark.put("/:id",     prendaController::actualizarPrenda);
                Spark.delete("/:id",  prendaController::borrarPrenda);
            });
        });

    }
}
