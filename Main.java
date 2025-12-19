public class Main {
    public static void main(String[] args){
        Customer h=new Customer("Habiba");
        Pizza p=new Pizza("Pepperoni",90,PizzaCrust.DEEP_DISH);
        p.addCustomization("Extra Cheese"); p.addCustomization("Olives");
        Wedges w=new Wedges("Spicy Wedges",40,WedgesSpiceLevel.HOT);
        w.addCustomization("Garlic Sauce");
        Drink d=new Drink("Cola",15,DrinkSize.LARGE);
        h.getOrder().addItem(p); h.getOrder().addItem(w); h.getOrder().addItem(d);
        ReceiptPrinter.print(h);
    }
}