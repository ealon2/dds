package qmp;

import java.util.List;

public interface Observable {

    public List<qmp.Observer> listeners = null;

    public void add(Observer observer);
    public void remove (Observer observer);
    public void inform();
}
