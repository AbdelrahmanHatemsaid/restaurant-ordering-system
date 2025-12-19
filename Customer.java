public class Customer {
    private String name; private Order order;
    public Customer(String n){name=n;order=new Order();}
    public String getName(){return name;} public Order getOrder(){return order;}
}