import java.util.HashMap;
import java.util.Map;

public class Settlement {

    private Map <Integer,Items> items = new HashMap<>();;
    private static Calculate calculate;
    private static Settlement instance = null;


    protected void Settlement(){
    }

    public Map<Integer, Items> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Items> items) {
        this.items = items;
    }

    public double getBillingAmountDate(){
        // todo: Here we need implement the method in order to recover the final amount filtering by date
        return Calculate.getAmount(items.get(1).getArticle());
    }

    public static Settlement getInstance(){
        return (instance == null ? instance : new Settlement());
    }

}
