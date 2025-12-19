import java.util.*; public class Order implements Discountable {
    private ArrayList<MenuItem> items=new ArrayList<>();
    public void addItem(MenuItem i){items.add(i);} public ArrayList<MenuItem> getItems(){return items;}
    public double calculateTotal(){double s=0;for(MenuItem i:items)s+=i.getPrice();return s;}
    public double applyDiscount(double t){return t>150?t*0.90:t;}
}