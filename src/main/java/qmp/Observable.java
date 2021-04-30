package qmp;

import java.util.List;

public interface Observable {

    public List<qmp.Observer> listeners = null;

    public void add(qmp.Observer observer);
    public void remove (qmp.Observer observer);
    public void inform();
}
