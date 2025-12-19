public class ReceiptPrinter {
    public static void print(Customer c){
        Order o=c.getOrder(); double t=o.calculateTotal(); double d=o.applyDiscount(t);
        System.out.println("======== RECEIPT ========"); System.out.println("Customer: "+c.getName());
        for(MenuItem i:o.getItems()){System.out.println(i.prepare());System.out.println(i.serve());}
        System.out.println("Subtotal: "+t+" EGP"); System.out.println("Total: "+d+" EGP");
    }
}