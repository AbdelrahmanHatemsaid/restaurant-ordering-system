public abstract class MenuItem implements Preparable, Servable, PriceAdjustable {
    protected String name; protected double price;
    public MenuItem(String n,double p){name=n;price=p;}
    public String getName(){return name;} public double getPrice(){return price;}
    public void increasePrice(double a){price+=a;} public void decreasePrice(double a){price=Math.max(0,price-a);}
    public String serve(){return "Serving: "+name+" — "+price+" EGP";}
}