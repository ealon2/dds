package qmp;

public class Prenda implements Observer{
    private final Observable consumer;

    public  Prenda(Observable consumer){

        this.consumer = consumer;
    }

}
