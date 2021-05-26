package qmp.model;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class GuardarropaTest {

    private Guardarropa guardarropaViaje;
    private Guardarropa guardarropaEntrecasa;
    private Guardarropa guardarropaOtro;
    private Usuario usuario;
    private Usuario usuarioCompartido;

    @Mock
    private Prenda prenda;

    @BeforeEach
    public void setUp(){
        guardarropaOtro=new Guardarropa(TipoGuardarropa.OTRO);
        guardarropaViaje=new Guardarropa(TipoGuardarropa.VIAJE);
        guardarropaEntrecasa=new Guardarropa(TipoGuardarropa.ENTRECASA);
        usuario= new Usuario("Buenos Aires",new Atuendo());
        usuarioCompartido= new Usuario("Buenos Aires",new Atuendo());
    }

    @Test
    public void agregarPrendaEnGuardarropaTest(){
        this.guardarropaOtro.agregarPrenda(prenda);
    }

    @Test
    public void quitarPrendaEnGuardarropaTest(){
        this.guardarropaOtro.quitarPrenda(prenda);
    }

    @Test
    public void compartirGuardarropa(){
        Assert.assertTrue(usuarioCompartido.getGuardarropas().isEmpty());
        this.guardarropaOtro.compartirCon(usuarioCompartido);
        Assert.assertTrue(usuarioCompartido.getGuardarropas().contains(guardarropaOtro));
    }


}
