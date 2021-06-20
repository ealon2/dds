package qmp.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuardarropaTest {

    private Guardarropa guardarropa;
    private Usuario usuario;
    private Usuario usuarioCompartido;
    private SugerenciaCommand sugerenciaAlta;
    private Prenda prenda;


    @BeforeEach
    public void setUp(){
        guardarropa =new Guardarropa("Entrecasa");
        usuario= new Usuario("Buenos Aires");
        usuarioCompartido= new Usuario("Buenos Aires");
        prenda = new Prenda();
        sugerenciaAlta = new AgregarPrenda(prenda,guardarropa);
    }

    @Test
    public void agregarPrendaEnGuardarropaTest(){
        this.guardarropa.agregarPrenda(prenda);
    }

    @Test
    public void quitarPrendaEnGuardarropaTest(){
        this.guardarropa.quitarPrenda(prenda);
    }

    @Test
    public void compartirGuardarropa(){

        usuario.agregrarGuardarropa(guardarropa);
        Assertions.assertTrue(usuarioCompartido.getGuardarropas().isEmpty());
        usuario.compartirCon(usuarioCompartido,guardarropa);
        Assertions.assertTrue(usuarioCompartido.getGuardarropas().contains(guardarropa));
    }

    @Test
    public void aceptarSugerencias(){

        Assertions.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas al usuario
        usuario.agregrarGuardarropa(guardarropa);

        // al ejecutar la sugerencia se debe guardar en el guardarropa
        usuario.ejecutarSugerencia(sugerenciaAlta);

        // valido
        Assertions.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);
        Assertions.assertFalse(usuario.getGuardarropas().get(0).getPrendas().isEmpty());
    }

    @Test
    public void rechazarSugerencias(){

        Assertions.assertTrue(usuario.getSugerencias().isEmpty());
        usuario.escucharSugerencias(sugerenciaAlta);
        Assertions.assertFalse(usuario.getSugerencias().isEmpty());
    }

    @Test
    public void deshacerSugerencias(){

        // No tiene asignado guardarropa el usuario
        Assertions.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas vacio al usuario
        usuario.agregrarGuardarropa(guardarropa);

        //Valido que el guardarropa esta vacio
        Assertions.assertTrue(usuario.getGuardarropas().get(0).getPrendas().isEmpty());

        usuario.ejecutarSugerencia(sugerenciaAlta);

        //Valido que el guardarropa tiene una prenda
        Assertions.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);

        usuario.reversarSugerencia(sugerenciaAlta);

        // Valido que esta de nuevo vacio
        Assertions.assertTrue(usuario.getGuardarropas().get(0).getPrendas().isEmpty());

    }
}
