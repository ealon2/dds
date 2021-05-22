package qmp;

import java.util.List;

public class Atuendo implements Observable{

    private List<Observer> prendas;

    public Atuendo (List<Observer> prendas){
        this.prendas=prendas;
    }

    @Override
    public void add(Observer observer) {
        this.prendas.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.prendas.remove(observer);
    }

    @Override
    public void inform(){
        prendas.stream().forEach(x->x.update(new Mensaje() {
        }));
    }
}

