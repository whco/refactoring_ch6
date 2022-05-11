package extract_method;

import java.util.Enumeration;
import java.util.Vector;

public class Owing {
    public Vector<Order> _orders = new Vector<>();
    private String _name;

    public Owing(String _name) {
        this._name = _name;
    }

    void printOwing() {
        double outstanding = outstanding();
        printBanner();
        // calculate outstanding

        printDetails(outstanding);
    }

    void printBanner() {
        // print banner
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
    }
    void printDetails(double outstanding) {
        //print details
        System.out.println ("name:" + _name);
        System.out.println ("amount" + outstanding);
    }

    double outstanding() {
        Enumeration e = _orders.elements();
        double result = 0.0;
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

    public static void main(String[] args) {
        Owing owing = new Owing("o1");
        owing._orders.add(new Order(10));
        owing._orders.add(new Order(20));
        owing._orders.add(new Order(30));
        owing._orders.add(new Order(50));
        owing.printOwing();
    }
}
