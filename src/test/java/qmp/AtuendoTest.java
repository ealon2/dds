package qmp;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class AtuendoTest{

    private Atuendo atuendo;

    @Before
    public void setUp() throws Exception{
        atuendo = new Atuendo(new ArrayList<Observer>());
    }

    @Test
    public void addAtuendoTest() throws Exception{
        atuendo.add(new Prenda(atuendo));
    }

    @Test
    public void removeAtuendoTest() throws Exception{
        atuendo.remove(new Prenda(atuendo));
    }


}
