package qmp.model;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class GuardarropaTest {

    private Guardarropa guardarropa;
    private Usuario usuario;
    private Usuario usuarioCompartido;
    private SugerenciaCommand sugerenciaAlta;

    @Mock
    private Prenda prenda;


    @BeforeEach
    public void setUp(){
        guardarropa =new Guardarropa("Entrecasa");
        usuario= new Usuario("Buenos Aires");
        usuarioCompartido= new Usuario("Buenos Aires");
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
        Assert.assertTrue(usuarioCompartido.getGuardarropas().isEmpty());
        usuario.compartirCon(usuarioCompartido,guardarropa);
        Assert.assertTrue(usuarioCompartido.getGuardarropas().contains(guardarropa));
    }

    @Test
    public void aceptarSugerencias(){

        Assert.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas al usuario
        usuario.agregrarGuardarropa(guardarropa);

        // al ejecutar la sugerencia se debe guardar en el guardarropa
        usuario.ejecutarSugerencia(sugerenciaAlta);

        // valido
        Assert.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);
        Assert.assertFalse(usuario.getGuardarropas().get(0).getPrendas().isEmpty());
    }

    @Test
    public void rechazarSugerencias(){

        Assert.assertTrue(usuario.getSugerencias().isEmpty());
        usuario.escucharSugerencias(sugerenciaAlta);
        Assert.assertFalse(usuario.getSugerencias().isEmpty());
    }

    @Test
    public void deshacerSugerencias(){

        // No tiene asignado guardarropa el usuario
        Assert.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas vacio al usuario
        usuario.agregrarGuardarropa(guardarropa);

        //Valido que el guardarropa esta vacio
        Assert.assertTrue(usuario.getGuardarropas().get(0).getPrendas().isEmpty());

        usuario.ejecutarSugerencia(sugerenciaAlta);

        //Valido que el guardarropa tiene una prenda
        Assert.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);

        usuario.reversarSugerencia(sugerenciaAlta);

        // Valido que esta de nuevo vacio
        Assert.assertTrue(usuario.getGuardarropas().get(0).getPrendas().isEmpty());

    }
}
