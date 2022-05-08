public class Main {
    public static void main(String[] args) {
        Aggregate aggr = new ConcreteAggregate();
        Iterator iter = aggr.getIterator();
        while (iter.hasNext()) {
            char alpha = (char)iter.next();
            System.out.println("¾ËÆÄºª : " + alpha);
        }
    }
}
