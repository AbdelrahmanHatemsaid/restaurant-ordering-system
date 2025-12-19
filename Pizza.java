import java.util.*; public class Pizza extends MenuItem implements Customizable {
    private PizzaCrust crust; private ArrayList<String> toppings=new ArrayList<>();
    public Pizza(String n,double p,PizzaCrust c){super(n,p);crust=c;if(c==PizzaCrust.DEEP_DISH)increasePrice(15);}
    public String prepare(){return "Preparing "+crust+" crust pizza";}
    public void addCustomization(String t){toppings.add(t);increasePrice(7);}
    public String getCustomizations(){return toppings.isEmpty()?"No extra toppings":toppings.toString();}
    public String serve(){return super.serve()+" | Toppings: "+getCustomizations();}
}