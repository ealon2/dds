package qmp.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuardarropasTest {

    private Guardarropas guardarropas;
    private Usuario usuario;
    private Usuario usuarioCompartido;
    private Sugerencia sugerenciaAlta;
    private Prenda prenda;


    @BeforeEach
    public void setUp(){
        guardarropas =new Guardarropas();
        usuario= new Usuario("Buenos Aires");
        usuarioCompartido= new Usuario("Buenos Aires");
        //prenda = new PrendaBuilder(new TipoDePrenda(Categoria.CALZADO)).crearPrenda();
        sugerenciaAlta = new AgregarPrenda(prenda);
    }

    @Test
    public void agregarPrendaEnGuardarropaTest(){
        this.guardarropas.agregarPrenda(prenda);
    }

    @Test
    public void quitarPrendaEnGuardarropaTest(){
        this.guardarropas.quitarPrenda(prenda);
    }

    @Test
    public void compartirGuardarropa(){

        usuario.agregrarGuardarropas(guardarropas);
        Assertions.assertTrue(usuarioCompartido.getGuardarropas().isEmpty());
        usuario.compartirCon(usuarioCompartido, guardarropas);
        Assertions.assertTrue(usuarioCompartido.getGuardarropas().contains(guardarropas));
    }

    @Test
    public void aceptarSugerencias(){

        Assertions.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas al usuario
        usuario.agregrarGuardarropas(guardarropas);

        // al ejecutar la sugerencia se debe guardar en el guardarropa
        guardarropas.aceptarSugerencia(sugerenciaAlta);

        // valido
        Assertions.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);
        Assertions.assertFalse(usuario.getGuardarropas().get(0).getPrendas().isEmpty());
    }

    @Test
    public void rechazarSugerencias(){

        Assertions.assertTrue(guardarropas.obtenerSugerencias().isEmpty());
        guardarropas.aceptarSugerencia(sugerenciaAlta);
        Assertions.assertFalse(guardarropas.obtenerPrendas().isEmpty());
    }

    @Test
    public void deshacerSugerencias(){

        // No tiene asignado guardarropa el usuario
        Assertions.assertTrue(guardarropas.obtenerSugerencias().isEmpty());

        //Agrego un guardarropas vacio al usuario
        guardarropas.agregrarSugerencia(sugerenciaAlta);

        //Valido que el guardarropa esta vacio
        Assertions.assertTrue(guardarropas.obtenerPrendas().isEmpty());

        guardarropas.aceptarSugerencia(sugerenciaAlta);

        //Valido que el guardarropa tiene una prenda
        Assertions.assertEquals(guardarropas.getPrendas().get(0) ,prenda);

        guardarropas.reversarSugerencia(sugerenciaAlta);

        // Valido que esta de nuevo vacio
        Assertions.assertTrue(guardarropas.getPrendas().isEmpty());

    }
}
