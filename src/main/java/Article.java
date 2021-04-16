public interface Article {

    public double basePrice = 0;
    public States state = States.NEW;

    public double getBasePrice();
    public void setBasePrice();
    public States getState();

}
