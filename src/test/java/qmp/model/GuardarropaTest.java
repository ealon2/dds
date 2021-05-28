package qmp.model;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class GuardarropaTest {

    private Guardarropa guardarropa;
    private Usuario usuario;
    private Usuario usuarioCompartido;

    @Mock
    private Prenda prenda;

    @BeforeEach
    public void setUp(){
        guardarropa =new Guardarropa("Entrecasa");
        usuario= new Usuario("Buenos Aires");
        usuarioCompartido= new Usuario("Buenos Aires");
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
    public void revisarSugerencias(){

    }

    @Test
    public void aceptarSugerencias(){

        Prenda prenda = new Prenda();

        Assert.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas al usuario
        usuario.agregrarGuardarropa(guardarropa);

        // al ejecutar la sugerencia se debe guardar en el guardarropa
        usuario.ejecutarSugerencia(new AgregarPrenda(prenda,guardarropa));

        // valido
        Assert.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);
        Assert.assertFalse(usuario.getGuardarropas().get(0).getPrendas().isEmpty());
    }

    @Test
    public void rechazarSugerencias(){

    }

    @Test
    public void deshacerSugerencias(){
        Prenda prenda = new Prenda();
        AgregarPrenda sugerencia = new AgregarPrenda(prenda,guardarropa);

        // No tiene asignado guardarropa el usuario
        Assert.assertTrue(usuario.getGuardarropas().isEmpty());

        //Agrego un guardarropas vacio al usuario
        usuario.agregrarGuardarropa(guardarropa);

        //Valido que el guardarropa esta vacio
        Assert.assertTrue(usuario.getGuardarropas().get(0).getPrendas().isEmpty());

        usuario.ejecutarSugerencia(sugerencia);

        //Valido que el guardarropa tiene una prenda
        Assert.assertEquals(usuario.getGuardarropas().get(0).getPrendas().get(0) ,prenda);

        usuario.reversarSugerencia(sugerencia);

        // Valido que esta de nuevo vacio
        Assert.assertTrue(usuario.getGuardarropas().get(0).getPrendas().isEmpty());

    }
}
