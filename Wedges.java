import java.util.*; public class Wedges extends MenuItem implements Customizable {
    private WedgesSpiceLevel spice; private ArrayList<String> sauces=new ArrayList<>();
    public Wedges(String n,double p,WedgesSpiceLevel s){super(n,p);spice=s;if(s==WedgesSpiceLevel.HOT)increasePrice(5);}
    public String prepare(){return "Frying wedges — Spice Level: "+spice;}
    public void addCustomization(String s){sauces.add(s);}
    public String getCustomizations(){return sauces.isEmpty()?"No sauces":sauces.toString();}
    public String serve(){return super.serve()+" | Sauces: "+getCustomizations();}
}