public class Drink extends MenuItem {
    private DrinkSize size;
    public Drink(String n,double p,DrinkSize s){super(n,p);size=s;increasePrice(s.getExtraCost());}
    public String prepare(){return "Pouring a "+size+" "+name;}
    public String serve(){return super.serve()+" | Size: "+size;}
}